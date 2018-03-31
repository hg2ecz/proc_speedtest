#include <stdio.h>
#include <glob.h>


int main(int argc, char * argv[]){

	glob_t pglob;
	unsigned int i,j;
	unsigned int errctr=0,ctr=0;
	char buff[10000];


	for(j=0; j<10000; j++){
		int retc=glob("/proc/[0-9]*/stat", 0, NULL, &pglob);
		if(retc!=0){ printf("Debug: retc=%u\n",retc); }
		for(i=0; i<(unsigned)pglob.gl_pathc; i++){
			FILE *f=fopen(pglob.gl_pathv[i],"r");
			if (f) {
				if (fgets(buff, sizeof(buff),f)) {
					// printf("%s\n", buff);
					ctr++;
				}
				fclose(f);

			} else {
				errctr++;
			}
		}
		globfree(&pglob);
	}

	printf("Count: %u\n",ctr);
	printf("Error Count: %u\n",errctr);

	return 0;
}

