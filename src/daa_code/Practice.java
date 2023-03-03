/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daa_code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author JM
 */
public class Practice {
    
    public static void main(String[] args){
        String S_FareLimitResponse = JOptionPane.showInputDialog(null, "Input Fare Limit");
        float inte= Float.parseFloat(S_FareLimitResponse);
        System.out.print(inte);
      
    }
}
