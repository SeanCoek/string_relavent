package jsa.reflection;

import dk.brics.automaton.Automaton;
import dk.brics.string.StringAnalysis;
import soot.SootClass;
import soot.Type;
import soot.ValueBox;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class BaseCase {

    public static String sig = "<java.lang.Class: java.lang.Class forName(java.lang.String)>";
    public static String sig_m = "<java.lang.reflect.Method: java.lang.String getName()>";
    public static String sig_f = "<java.lang.reflect.Field: java.lang.String getName()>";

    public static void writeAutomaton(String filename, Automaton a) {

        String automatonFilename = "jsaResult/" + filename + ".automaton";
        String dotFilename = "jsaResult/" + filename + ".dot";
        a.minimize();
        try {
            OutputStream os = new FileOutputStream(automatonFilename);
            a.store(os);
            os.close();
            PrintWriter dotpw = new PrintWriter(dotFilename);
            String dot = a.toDot();
            dotpw.print(dot);
            dotpw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void analyze(String filename) {
        SootClass c = StringAnalysis.loadClass(filename);
        Set<ValueBox> hotspots = new HashSet<>();
        hotspots.addAll(StringAnalysis.getArgumentExpressions(sig, 0));
        StringAnalysis sa = new StringAnalysis(hotspots);
        for(ValueBox v:hotspots){
            Automaton a = sa.getAutomaton(v);
            writeAutomaton(filename, a);
        }
    }

    public static void main(String[] args) {
        analyze("jsa.reflection.others.Tricky");
    }
}
