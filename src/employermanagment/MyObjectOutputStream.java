/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employermanagment;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author sabbagh99
 */
public class MyObjectOutputStream  extends ObjectOutputStream{

    public MyObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public void writeStreamHeader() throws IOException{
        return;
    }
}
