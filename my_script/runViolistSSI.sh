#! /bin/bash

rm -r ~/Violist_Replication/Java/myown/refletion
cd ~/IdeaProjects/Violist_old/Replication/Java/myown/reflection
find -name "*.java" > sources.txt
javac -d ~/Violist_Replication/Java/myown/ -cp .. @sources.txt
cd ~/Violist_Replication
./runJavaSSI.sh Java myown
