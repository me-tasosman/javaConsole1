/*
 * The MIT License
 *
 * Copyright 2020 Osman Tas <me@tasosman.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package javaconsole1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Osman Tas <me@tasosman.com>
 */
public class JavaConsole1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // read user input using BufferedReader class
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s1 = null;
        try {
            s1 = stdin.readLine();
        } catch (IOException ex) {
            Logger.getLogger(JavaConsole1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("user entered: "+ s1);
        
        // read user input using Scanner class
        Scanner input = new Scanner(System.in);
        String s2 = input.nextLine();
        System.out.println("user entered: "+ s2);
    }
    
}
