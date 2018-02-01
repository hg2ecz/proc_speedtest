#!/bin/bash

alias tm='/usr/bin/time -f "%e %S %U %I %O %c"'
shopt -s expand_aliases
cd ~/tmp

echo -e "\npython 2.7(?)"
tm python ./ggg.py

echo -e "\npython 3"
tm python3 ./ggg.py

echo -e "\nruby"
tm ruby ./ggg.rb

echo -e "\npypy"
tm pypy ./ggg.py

echo -e "\nC"
tm ./ggg



