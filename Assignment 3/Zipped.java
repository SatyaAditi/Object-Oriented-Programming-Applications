import java.io.*;
import java.util.*;
class Zipped
{

public static void writeToFileZipFileContents(String zipFileName,String outputFileName) throws java.io.IOException 
{
java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.US_ASCII;
    java.nio.file.Path outputFilePath = java.nio.file.Paths.get(outputFileName);

    // Open zip file and create output file with 
    // try-with-resources statement

 try (java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)) {
        // Enumerate each entry
        for (java.util.Enumeration entries = zf.entries(); entries.hasMoreElements();) 
           {
            // Get the entry name and write it to the output file
            String newLine = System.getProperty("line.separator");
            String zipEntryName =((java.util.zip.ZipEntry)entries.nextElement()).getName() +  newLine;
            writer.write(zipEntryName, 0, zipEntryName.length());
        }
    }
}
public static void main(String args[])
{
try
{
writeToFileZipFileContents("C:/Users/Aditi/Desktop/Assignment 3.zip","C:/Users/Aditi/Desktop/copy.txt");
}
catch(Exception e)
{
}
} 

}