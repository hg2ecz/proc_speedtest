#!/bin/bash

alias tm='/usr/bin/time -f "%e %S %U %I %O %c"'
shopt -s expand_aliases

echo -e "\njava"
tm java Proc_Speed_Test

echo -e "\npython 2.7(?)"
tm python ./proc_speed_test.py

echo -e "\npython 3"
tm python3 ./proc_speed_test.py

echo -e "\nruby"
tm ruby ./proc_speed_test.rb

echo -e "\npypy"
tm pypy ./proc_speed_test.py

echo -e "\nC"
tm ./proc_speed_test_c



