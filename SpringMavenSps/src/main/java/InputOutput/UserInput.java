package InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserInput {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		//
		// // Byte Streams
		//
		// String texts = "some text";
		//
		// FileOutputStream out = null;
		// try {
		// out = new FileOutputStream("Test.txt");
		// out.write(texts.getBytes());
		//
		// } finally {
		// if (out != null) {
		// out.close();
		// }
		// }
		//
		// FileInputStream ins = null;
		// try {
		// ins = new FileInputStream("Test.txt");
		// int c;
		// while ((c = ins.read()) != -1) {
		// System.out.print((char) c);
		// }
		// } finally {
		// if (ins != null) {
		// ins.close();
		// }
		// }
		// }

		// char stream

		// FileReader inputStream = null;
		//
		// try {
		// inputStream = new FileReader("Test.txt");
		//
		// int c;
		// while ((c = inputStream.read()) != -1) {
		//
		// }
		// } finally {
		// if (inputStream != null) {
		// inputStream.close();
		// }
		// }

		// FileWriter fr = null;
		// String strf = "Say hello again,adfauaf";
		// try {
		// fr = new FileWriter("NewFILW.txt");
		// fr.write(strf);
		// } finally {
		// if (fr != null) {
		// fr.close();
		// }
		// }

		// buffer

		// BufferedReader inStream = null;
		//
		// try {
		// inStream = new BufferedReader(new FileReader("Test.txt"));
		// int c;
		// while ((c = inStream.read()) != -1) {
		// System.out.print((char) c);
		// }
		// } finally {
		// if (inStream != null) {
		// inStream.close();
		// }
		//
		// }
		//
		BufferedWriter outStream = null;
		try {
			outStream = new BufferedWriter(new FileWriter("Rewe.txt"));
			String str = "This is added now";
			outStream.write(str.toCharArray());
		} finally {
			if (outStream != null) {
				outStream.close();
			}
		}
	}
}
