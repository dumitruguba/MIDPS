# Laboratorul nr.1

---

####Program 1a

Am avut de creat o forma folosind: 3 butoane (2-pentru incrementare, decrementare unei variabile intregi "i" si al 3-lea pentru iesirea din program),
un edit box - in care va fi afisata valoarea variabilei "i" si 2 etichete(una pentru afisarea unui text static, cealalta pentru afisarea starii variabilei "i"). 

####Program 1b

In acest program a trebuit de realizat un cronometru utilizind urmatoarele componente VCL: 4 butoane, 2 timere, 2 edit box-uri si 2 etichete. 
Buton 1 - pentru startarea cronometrului, buton 2 - pentru oprirea cronometrului, buton 3 - pentru resetarea lui, buton 4 - pentru exit, timer1 - cu interval 
1000 ms pentru afisarea timpului, timer2 - cu interval 100 ms pentru cronometru, un edit box pentru afisarea timpului curent si altul pentru cronometrare 
si deja etichetele cu text static.

####Program 1c

A fost nevoie sa construim o forma simulind un bargraf si o diagrama cu avans continuu. Am utilizat 3 butoane(1 - pentru start, 2 - stop, 3 - exit), 2 etichete, 
un edit box - pentru timpul curent, 2 timere(timer1 - timpul curent, timer2 - pentru afisare in diagrama si bargraf). Pentru realizarea bargrafului am folosit
2 obiecte TPanel suprapuse de culori diferite, inaltimea celui de-a 2-lea variind conform functiei random(). Pentru a crea diagrama se utilizează un element 
TPaintbox, in care desenam o grila. Functia din diagrama se deseneaza datorita unei variabile generata random intr - un interval fixat. Am folosit CopyRect() 
pentru copierea unei bucati de diagrama mutind-o la dreapta.


