from PIL import Image
import numpy as np

obrazek = Image.open("D:/MC_IO_GR1/lab1/cwiczenia/inicjaly.bmp")  # wczytywanie obrazu
print("tryb:", obrazek.mode)
print("format:", obrazek.format)
print("rozmiar:", obrazek.size)

dane_obrazka = np.asarray(obrazek)*1
print(dane_obrazka)

f = open("inicjaly.txt","x")
for rows in dane_obrazka:
    for item in rows:
        f.write(str(item) + ' ')
    f.write('\n')

obraz2 = Image.open("D:/MC_IO_GR1/lab1/cwiczenia/inicjaly.bmp")
dane_obrazka2 = np.asarray(obraz2)
print("Typ danych:",dane_obrazka2.dtype)
print("rozmiar:", dane_obrazka2.size)
print("Liczba elementów: ", dane_obrazka2.shape)