import java.io.*;


public class Fichier
{
public static void main (String [] argv) throws IOException
{
RandomAccessFile f = new RandomAccessFile ("fic.dat", "rw");
f.writeInt (34);
f.writeDouble (3.14159);
f.writeBytes ("Bonjour\n");
f.writeChars ("ce serait un bon squelette");
f.seek (0); //f.length ()
int i = f.readInt ();
double g = f.readDouble ();
String str = f.readLine ();
System.out.println (i + "");
System.out.println (g);
System.out.println (str);
f.close ();
} // main ()
} //Fichier