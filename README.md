# proc_speedtest
Egy kis sebességteszt a /proc alatti fájlok olvasásához

Kíváncsi voltam, egy pythonban megírt monitoring program mennyire vállalható, aztán meg jött, hogy akkor ki is kéne próbálni, hogy mennyivel gyorsabb ugyanaz C-ben.  Meglepő, hogy a jelek szerint a python3 kb. dupla ideig fut, mint akár a python2, akár a ruby...  Ahogy az is, hogy a pypy-vel futtatott kód alig gyorsabb, mint az interpreteres verzió.
De számomra a legmeglepőbb az volt, hogy a java változat, amit nem tudtam eléggé primitívre alakítani, egyedül a python3-as verziónál fut gyorsabban.
Futásidők nagyjából:
-  C: 		27s
-  Python 2.7:	41s
-  Python 3:	85s
-  Pypy:	38s
-  Ruby:	33s
-  Java:	65s 

Újabb kernellel(rendesen felgyorsult), immár a perl is tesztelve:
-  C:		18s
-  Python 2.7:	33s
-  Python 3:	70s
-  Pypy:	25s
-  Ruby:	28s
-  Java:	55s
-  Perl:	25s

Mindezt egy Dell E5570 notebookon, i5-6300U procival, Ubuntu 16.04.3 alatt, 4.13.0-32 kernellel.
 
