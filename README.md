Bioinformatics Sequence Matching
======================
Implemented in Java

What it does?
=============
Given the text file (eg.: example_RS126_PDB.txt) which contains a data represented as follows

1ACX:A
APAFSVSPASGASDGQSVSVSVAAAGETYYIAQCAPVGGQDACNPATATSFTTDASGAASFSFTVRKSYAGQTPSGTPVGSVDCATDACNLGAGNSGLNLGHVALTFG
--EEEEE--CC--CC-EEEEEEEC--CEEEEEEE-EECCEE---CCC--EEE--CC---EEEEE--CEEEEE-CCC-EEEEEECCCC--EEEEE-CC-----------

Where , 1ACX:A is the title ( Not to be considered) for processing

Sequence 1: APAFSVSPASGASDGQSVSVSVAAAGETYYIAQCAPVGGQDACNPATATSFTTDASGAASFSFTVRKSYAGQTPSGTPVGSVDCATDACNLGAGNSGLNLGHVALTFG

Sequence 2:  --EEEEE--CC--CC-EEEEEEEC--CEEEEEEE-EECCEE---CCC--EEE--CC---EEEEE--CEEEEE-CCC-EEEEEECCCC--EEEEE-CC-----------

This is read as the each letter in sequence1 is coded by the letter in sequence 2
Like the first one A -> - , P -> - , A->E

Program requirements: 

(1) Given the input file with the above data representation i.e title,sequence 1 and sequence 2 ( more than 100 records like this in one text file)

Partition the data into four set i.e extract all the letters which (one, or group of continuous letters which will form - , H, E, C)

For example:
The  - set will be AP (as it is continuous) , next PA
E will be AFSVS, 
C will be SG, and so on for all the records given in the text file

(2) Once generated three textile with  list, there will be a patterns which will be repeated so need to calculate the frequency of each pattern repeated in the three files

(3) Finally generate the unique  list of patterns of this file


How to run?
=============
Browse to 'dist' folder.

Command line execute in Windows/Linux/Mac: java -jar SequenceMatching.jar 

Make sure current updated Java runtime is installed on your machine: http://java.com/en/download/



Credits
=======

University Department of LifeScience (http://www.mu.ac.in/science/lifescience/profile.html)
University Department of Computer Science (http://www.mu.ac.in/science/cs/aboutudcs.html)
University Department of Information Technology (http://www.mu.ac.in/science/UDIT/home.html)



License
=======

The MIT License (MIT)

Copyright (c) 2014 sameersemna

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
