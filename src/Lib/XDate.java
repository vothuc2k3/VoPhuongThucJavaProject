/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hughey
 */
public class XDate {

    public static String pattern = "dd, MM, yyyy";
    public static SimpleDateFormat sdf = new SimpleDateFormat(pattern);

    public static Object stringToDate(String text) {
        try {
            return sdf.parse(text);
        } catch (ParseException ex) {
            System.err.println("Parse failed");
        }
        return null;
    }

    public static String DateToString(Object o) {
        if (o != null) {
            Date d = (Date) o;
            return sdf.format(d);
        }
        return "";
    }

}
