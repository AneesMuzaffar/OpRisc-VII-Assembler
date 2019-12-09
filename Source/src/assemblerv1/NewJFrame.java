package assemblerv1;

/**
 *
 * @author Anees Muzzafer Shah
 */
import java.awt.Font;
import java.io.File;
import java.util.*;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger; 
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;

public class NewJFrame extends javax.swing.JFrame
{

    RSyntaxTextArea inputCode;
    Map<String, String> labels = new Hashtable<>();
    Map<String, String> var_address = new Hashtable<>();
    Map<String, String> var_values = new Hashtable<>();
    
    int varAddrStart = 0;

    boolean org = false;

    String asm_code;
    String hex_code = "";

    public NewJFrame()
    {
        initComponents();
        
        this.setTitle("AVENGERS...ASSEMBLE!");
        
        inputCode = new RSyntaxTextArea(20, 60);
        inputCode.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_ASSEMBLER_X86);
        inputCode.setCodeFoldingEnabled(true);
        inputCode.setFont(new Font("Consolas", Font.PLAIN, 24));
        jScrollPane1.setViewportView(inputCode);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        file_button = new javax.swing.JMenu();
        new_button = new javax.swing.JMenuItem();
        open_button = new javax.swing.JMenuItem();
        save_button = new javax.swing.JMenuItem();
        saveAs_button = new javax.swing.JMenuItem();
        exit_button = new javax.swing.JMenuItem();
        export_button = new javax.swing.JMenu();
        help_button = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        file_button.setText("File");

        new_button.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        new_button.setText("New");
        new_button.setMinimumSize(new java.awt.Dimension(5, 0));
        new_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                new_buttonActionPerformed(evt);
            }
        });
        file_button.add(new_button);

        open_button.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open_button.setText("Open");
        file_button.add(open_button);

        save_button.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save_button.setText("Save");
        file_button.add(save_button);

        saveAs_button.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        saveAs_button.setText("Save As");
        saveAs_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveAs_buttonActionPerformed(evt);
            }
        });
        file_button.add(saveAs_button);

        exit_button.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exit_button.setText("Exit");
        file_button.add(exit_button);

        jMenuBar1.add(file_button);

        export_button.setText("Export");
        export_button.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                export_buttonMouseClicked(evt);
            }
        });
        jMenuBar1.add(export_button);

        help_button.setText("Help");
        jMenuBar1.add(help_button);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1278, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void export_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_export_buttonMouseClicked
        generate();
    }//GEN-LAST:event_export_buttonMouseClicked

    private void new_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_new_buttonActionPerformed
    {//GEN-HEADEREND:event_new_buttonActionPerformed
      //  createFileChooser(Ne);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                123 
        // TODO add your handling code here:
    }//GEN-LAST:event_new_buttonActionPerformed

    private void saveAs_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveAs_buttonActionPerformed
    {//GEN-HEADEREND:event_saveAs_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveAs_buttonActionPerformed

    private void build_label_table(String inputASM)
    {
        int address_loc = 0;
        for (String line : inputASM.split("\\n"))
        {
            if (line.split(" ")[0].equals("org"))
            {
                org = true;
                continue;
            }

            if (line.charAt(0) != '#' && line.charAt(0) != '$')
            {
                String[] lineParts = line.split(" ");
                if (lineParts.length == 3) 
                {
                    switch (lineParts[0])
                    {
                        case "LDR":
                            address_loc += 3;
                            break;
                        case "STR":
                            address_loc += 3;
                            break;
                        case "MOV":
                            address_loc += 2;
                            break;
                        default:
                            address_loc++;
                    }
                }
                else 
                    address_loc++;
                
                continue;
            }
            
            String[] lineParts = line.split(" ");
            String labelName = lineParts[0].substring(1);
            String labelValue = "000";
            
            if (lineParts.length == 2)
            {
                labelValue = lineParts[1];
            }
            
            if (line.charAt(0) == '$')
            {
                if (lineParts.length == 3) {
                    var_address.put(labelName, lineParts[2]);
                }
                
                var_values.put(labelName, labelValue);
            }
            else
            {
                if (org)
                {
                    labelValue = int2hex(address_loc);
                }

                labels.put(labelName, labelValue);
            }
        }
        
        varAddrStart = address_loc;
        
        for (String var : var_values.keySet())
        {
            if (var_address.containsKey(var)) {
                if (hex2int(var_address.get(var)) < address_loc) {
                    error(1);
                }
            } else {
                var_address.put(var, int2hex(address_loc));
                address_loc++;
            }
        }

        org = false;
    }

    private void generate()
    {
        hex_code = "v2.0 raw\n";
        String inputASM = inputCode.getText();
        build_label_table(inputASM);
        System.out.println(labels);
        for (String line : inputASM.split("\\n"))
        {
            if (line.split(" ")[0].equals("org"))
            {
                org = true;
                continue;
            }

            if (!org)
            {
                continue;
            }

            if (line.charAt(0) == '#')
            {
                continue;
            }
            
            String[] mcParseRes = machinecode(line.split(" ")).split("\\n");
            for (String resLine : mcParseRes)
            {
                hex_code += bin2hex(resLine) + "\n";  
            }
        }
        
        System.out.println(var_address);
        System.out.println(var_values);
        System.out.println(varAddrStart);
        System.out.println(hex2int(Collections.max(var_address.values())));
        
        for (int addrVar = varAddrStart; addrVar <= hex2int(Collections.max(var_address.values())); addrVar++)
        {
            boolean setMem = false;
            for (Map.Entry<String, String> entry : var_address.entrySet())
            {
                if (hex2int(entry.getValue()) == addrVar)
                {
                    hex_code += var_values.get(entry.getKey()) + "\n";
                    setMem = true;
                }
            }
            
            if (!setMem)
            {
                hex_code += "0\n";
            }
        }
        
        System.out.println(hex_code);
        try
        {
            create_file();
        } catch (IOException e)
        {
            error(2);
        }
    }
    
    private String bin2hex(String binIns)
    {
        return new BigInteger(binIns, 2).toString(16);
    }
    
    private String int2hex(int address_loc)
    {
        return int2hex(address_loc, 3);
    }
    
    private String int2hex(int address_loc, int width)
    {
        return String.format("%0" + String.valueOf(width) + "X", address_loc);
    }

    private String int2bin(char rcode)
    {
        String rc = String.valueOf(rcode);
        return String.format("%3s",
                Integer.toBinaryString(Integer.parseInt(rc)))
                .replace(" ", "0");
    }

    private String hex2bin(String hex)
    {
        return String.format("%4s",
                Integer.toBinaryString(Integer.parseInt(hex, 16)))
                .replace(" ", "0");
    }
    
    private int hex2int(String h2i)
    {
        return Integer.parseInt(h2i, 16);
    }

    private String hexa_bin(String br_add)
    {
        String made = "";

        for (int p = 0; p < 3; p++)
        {
            made += hex2bin(String.valueOf(br_add.charAt(p)));
        }

        return made;
    }

    private void error(int err)
    {

    }

    private void create_file() throws IOException
    {
        try (FileWriter fw = new FileWriter("e://out3put.hex"))
        {
            fw.write(hex_code);
            System.out.println("Writing successful");
            fw.close();
        }
    }

    private String addressPart(String arg)
    {
        String res = "";
        
        System.out.println(arg);

        switch (arg.charAt(0))
        {
            case '.':
                res = hexa_bin(arg.substring(1));
                break;
            case '#':
                res = hexa_bin(labels.get(arg.substring(1)));
                break;
            case '$':
                res = hexa_bin(var_address.get(arg.substring(1)));
                break;
        }
        
        System.out.println(arg.substring(1));
        System.out.println(var_address.get(arg.substring(1)));
        System.out.println(res);

        return res;
    }

    private String registerPart(String des, String src1, String src2)
    {
        return decode(src2) + decode(src1) + decode(des);
    }

    private String registerPart(String des, String src1)
    {
        return decode(src1) + decode(des);
    }

    private String decode(String reg)
    {
        return int2bin(reg.charAt(1));
    }

    private String machinecode(String[] args)
    {
        String bin_ins = "";

        switch (args[0])
        {
            case "LDR":
                if(args[1].charAt(0) == 'R')
                {
                    bin_ins = "1110100000" + registerPart(args[1], args[1]) + "\n"
                            + "0000" + addressPart(args[2]) + "\n"
                            + "1000000" + registerPart(args[1], "R0", args[1]);
                }   
                else
                    bin_ins = "0000" + addressPart(args[1]);
                break;
            case "STR":
                if(args[1].charAt(0) == 'R')
                {
                    bin_ins = "1110100000" + registerPart("R0","R0") + "\n"
                            + "1000000" + registerPart("R0", args[1],"R0") + "\n"
                            + "0001" + addressPart(args[2]);
                }
                else
                    bin_ins = "0001" + addressPart(args[1]);
                break;
            case "JMP":
                bin_ins = "0010" + addressPart(args[1]);
                break;
            case "JPZ":
                bin_ins = "0011" + addressPart(args[1]);
                break;
            case "JPC":
                bin_ins = "0100" + addressPart(args[1]);
                break;
            case "JPE":
                bin_ins = "0101" + addressPart(args[1]);
                break;
            case "STD":
                bin_ins = "0110000000000000";
                break;
            case "ADD":
                bin_ins = "1000000" + registerPart(args[1], args[2], args[3]);
                break;
            case "SUB":
                bin_ins = "1000010" + registerPart(args[1], args[2], args[3]);
                break;
            case "IEQ":
                bin_ins = "1000100" + registerPart(args[1], args[1], args[2]);
                break;
            case "AND":
                bin_ins = "1000110" + registerPart(args[1], args[2], args[3]);
                break;
            case "ORF":
                bin_ins = "1001000" + registerPart(args[1], args[2], args[3]);
                break;
            case "SLT":
                bin_ins = "1001010" + registerPart(args[1], args[2], args[3]);
                break;
            case "CMP":
                bin_ins = "1010000000" + registerPart(args[1], args[1]);
                break;
            case "SLR":
                bin_ins = "1010010" + registerPart(args[1], args[1], args[2]);
                break;
            case "SRL":
                bin_ins = "1010100" + registerPart(args[1], args[1], args[2]);
                break;
            case "INC":
                bin_ins = "1110000000" + registerPart(args[1], args[1]);
                break;
            case "DEC":
                bin_ins = "1110010000" + registerPart(args[1], args[1]);
                break;
            case "CLR":
                bin_ins = "1110100000" + registerPart(args[1], args[1]);
                break;
            case "CRF":
                bin_ins = "1110110000000000";
                break;
            case "INR":
                bin_ins = "1111000000000000";
                break;
            case "OTR":
                bin_ins = "1111010000000000";
                break;
            case "HLT":
                bin_ins = "1111111111111111";
                break;
            case "NOP":
                bin_ins = "1010110000000000";
                break;
            case "MOV":
                bin_ins = "1110100000" + registerPart(args[1], args[1]) + "\n"
                          + "1000000" + registerPart(args[1], args[2], args[1]) ;
                break;
                
        }

        return bin_ins;
    }

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private static void createFileChooser(final JFrame frame) {
 
        String filename = File.separator+"tmp";
        JFileChooser fileChooser = new JFileChooser(new File(filename));
 
        // pop up an "Open File" file chooser dialog
        fileChooser.showOpenDialog(frame);
 
        System.out.println("File to open: " + fileChooser.getSelectedFile());
 
        // pop up an "Save File" file chooser dialog
      /*  fileChooser.showSaveDialog(frame);
 
        System.out.println("File to save: " + fileChooser.getSelectedFile());
 */
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exit_button;
    private javax.swing.JMenu export_button;
    private javax.swing.JMenu file_button;
    private javax.swing.JMenu help_button;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem new_button;
    private javax.swing.JMenuItem open_button;
    private javax.swing.JMenuItem saveAs_button;
    private javax.swing.JMenuItem save_button;
    // End of variables declaration//GEN-END:variables

}
