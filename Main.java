import javax.swing.*;
import java.awt.event.ItemListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import javax.swing.*;



public class Main extends JFrame implements ActionListener, ItemListener {
    JFrame frame2, frame3, frame4, frame6;
    JLabel heading, heading2, f1, f2, f3, b4, b5, heading3;
    Container c, c2, c3, c4;
    JLabel label1;
    Timer timer;
    JLabel b1, b2, b3;
    JButton addPat, addDoct, submit, showDoct;

    JTextField field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13;

    String data[][] = {
            {"Nassem", "ali", "182-2323-23-1", "Malaria","Dr.Arif"},
            {"Aslam", "Kareem", "182-2323-23-1", "Hepatitis B","Dr.ARif ahmed"},
            {"Farhan", "Kashif", "182-2323-23-1", "Hepatitis C","Dr.Arif"}
    };

    String arr1[] = {"Dr.David (11:00am)","Dr.Vivek (3:00pm)","Dr.John (6:00am)","Dr.Ali (10:00am)"};
    String arr2[] = {"Dr.David (200USD$)","Dr.Vivek (300USD$)","Dr.John (100USD$)","Dr.Ali (500USD$)"};
    String arr3[] = {"Credit-card", "Easy-Paisa", "Already-Paid"};
    String arr4[] = {"2 Years","4 Years","8 Years","10 Years"};
    JComboBox box1, box2, box3, box4;


    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11;
    JTable table1, table2;
    String column[] = {"Name", "FatherName", "CNIC Number", "Patient Illness", "ChooseDoctor"};
    String data2[][] = {
            {"01", "Ali", "Cardiologist", "my2323@gmail.com", "2 Years"},
            {"02", "Aslam", "Neurologist", "asl2323@gmail.com", "10 Years"},
            {"03", "Arif", "Gastroenterologist", "arif2323@gmail.com", "4 Years"}
    };
    String column2[] = {"ID-no", "Name", "Specialization", "Contact", "Experience"};

    Main() {
         displayscreen();
        frame2 = new JFrame("Hospital Manager");
        frame2.setSize(600, 700);
        frame2.setLocationRelativeTo(null);
        frame2.setResizable(false);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null); // Set layout manager to null for absolute positioning

        label1 = new JLabel();
        label1.setBounds(225, 10, 400, 100);


        label1 = new JLabel("> Hospital Management System <");
        label1.setBounds(90, 70, 550, 50);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setForeground(new Color(241, 201, 12, 255));

        frame2.add(label1);

        c = getContentPane();
        c.setLayout(null);

        showDoct = new JButton("Show the Doctors");
        addPat = new JButton("Add the Patients");

        addDoct = new JButton("Add the Doctors");

        showDoct.setBounds(200, 220, 200, 40);
        addPat.setBounds(200, 310, 200, 40);

        addDoct.setBounds(200, 395, 200, 40);

        showDoct.addActionListener(this);
        addPat.addActionListener(this);

        addDoct.addActionListener(this);

        c.add(label1);
        c.add(showDoct);
        c.add(addPat);
        c.add(addDoct);


        c.setBackground(new Color(44, 62, 80)); // Set the background color of the content pane


        frame2.setContentPane(c);
//        frame2.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show the Doctors")) {
            frame3 = new JFrame("Doctors availability");
            frame3.setSize(1100, 700);
            frame3.setLocationRelativeTo(null);
            frame3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            c3 = new JPanel();
            c3.setLayout(null); // Use BorderLayout for automatic component positioning
            c3.setSize(800, 600); // Set the size of the panel
            c3.setBackground(new Color(44, 62, 80));

            b1 = new JLabel("Doctor-Appointment-Time");
            b2 = new JLabel("Doctor-Fee");
            b3 = new JLabel("Payment-Option");


            b1.setFont(new Font("Arial", Font.BOLD, 16));
            b2.setFont(new Font("Arial", Font.BOLD, 16));
            b3.setFont(new Font("Arial", Font.BOLD, 16));


            b1.setForeground(Color.white);
            b2.setForeground(Color.white);
            b3.setForeground(Color.white);

            b1.setBounds(100, 110, 250, 25);
            b2.setBounds(100, 190, 180, 25);
            b3.setBounds(100, 270, 180, 25);

            field6 = new JTextField();
            field6.setBounds(500, 108, 150, 25);
            field7 = new JTextField();
            field7.setBounds(500, 188, 150, 25);
            field8 = new JTextField();
            field8.setBounds(500, 268, 150, 25);



            
            box1 = new JComboBox(arr1);
  box1.addItemListener(this); // Add ItemListener after initializing field6
            box2 = new JComboBox(arr2);
  box2.addItemListener(this); // Add ItemListener after initializing field7

            box3 = new JComboBox(arr3);
  box3.addItemListener(this); // Add ItemListener after initializing field7
            box1.setBounds(320, 108, 150, 25);
            box2.setBounds(320, 188, 150, 25);
            box3.setBounds(320, 268, 150, 25);

            heading2 = new JLabel("> Doctor Availability <");
            heading2.setBounds(280, 0, 500, 70);
            heading2.setFont(new Font("Arial", Font.BOLD, 40));
            heading2.setForeground(new Color(241, 201, 12, 255));

            submit = new JButton("Submit");
            submit.addActionListener(this);
            submit.setBounds(320, 370, 150, 35);
            submit.setBackground(new Color(231, 76, 60));
            submit.setForeground(Color.WHITE);
            submit.setFont(new Font("arial", Font.BOLD, 20));




            c3.add(b1);
            c3.add(submit);
            c3.add(b2);
            c3.add(b3);
            c3.add(field6);
            c3.add(field7);
            c3.add(field8);
            c3.add(box1);
            c3.add(box2);
            c3.add(box3);
            c3.add(heading2);

            frame3.setContentPane(c3);
            frame3.setVisible(true);

        } else if (e.getActionCommand().equals("Add the Patients")) {
            frame4 = new JFrame("Patients");
            frame4.setSize(1130, 700);
            frame4.setLocationRelativeTo(null);
            frame4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


            c2 = new JPanel();
            c2.setLayout(null); // Use BorderLayout for automatic component positioning
            c2.setSize(800, 600); // Set the size of the panel
            c2.setBackground(new Color(44, 62, 80));



            button1 = new JButton("Name");
            button2 = new JButton("FatherName");
            button3 = new JButton("CNIC Number");
            button4 = new JButton("Patient Illness");
            button5 = new JButton("Choose Doctor");
            button6 = new JButton("Add");
            button7 = new JButton("Update");
            button8 = new JButton("Delete");

            button6.setBounds(555, 600, 120, 25);
            button7.setBounds(680, 600, 120, 25);
            button8.setBounds(805, 600, 120, 25);

            button6.setBackground(new Color(52, 152, 219)); // Blue color
            button7.setBackground(new Color(46, 204, 113)); // Green color
            button8.setBackground(new Color(231, 76, 60)); // Red color

            button6.setForeground(Color.white);
            button7.setForeground(Color.white);
            button8.setForeground(Color.white);


            field1 = new JTextField();
            field1.setBounds(300, 20, 150, 25);
            field2 = new JTextField();
            field2.setBounds(300, 80, 150, 25);
            field3 = new JTextField();
            field3.setBounds(300, 140, 150, 25);
            field4 = new JTextField();
            field4.setBounds(300, 250, 150, 25);
            field5 = new JTextField();
            field5.setBounds(300, 350, 150, 25);

            button1.setFont(new Font("Arial", Font.BOLD, 16));
            button2.setFont(new Font("Arial", Font.BOLD, 16));
            button3.setFont(new Font("Arial", Font.BOLD, 16));
            button4.setFont(new Font("Arial", Font.BOLD, 16));
            button5.setFont(new Font("Arial", Font.BOLD, 16));
            button6.setFont(new Font("Arial", Font.BOLD, 16));
            button7.setFont(new Font("Arial", Font.BOLD, 16));
            button8.setFont(new Font("Arial", Font.BOLD, 16));
            button1.setBackground(new Color(52, 152, 219));
            button2.setBackground(new Color(231, 76, 60));
            button3.setBackground(new Color(46, 204, 113));
            button4.setBackground(new Color(91, 123, 125, 207));
            button5.setBackground(new Color(100, 86, 238));

            heading = new JLabel("> Add your Patient here.");
            heading.setBounds(280, 0, 500, 70);
            heading.setFont(new Font("Arial", Font.BOLD, 40));
            heading.setForeground(new Color(241, 201, 12, 255));

            button1.setForeground(Color.white);
            button2.setForeground(Color.white);
            button3.setForeground(Color.white);
            button4.setForeground(Color.white);
            button5.setForeground(Color.white);

            button1.setBounds(100, 110, 150, 25);
            button2.setBounds(100, 190, 150, 25);
            button3.setBounds(100, 270, 150, 25);
            button4.setBounds(100, 353, 150, 25);
            button5.setBounds(100, 438, 150, 25);

            button6.setBounds(100, 550, 120, 25);
            button7.setBounds(230, 550, 120, 25);
            button8.setBounds(360, 550, 120, 25);

            field1.setLocation(300, 110);
            field2.setLocation(300, 190);
            field3.setLocation(300, 270);
            field4.setLocation(300, 353);
            field5.setLocation(300, 438);

            c2.add(heading);

            c2.add(button1);
            c2.add(button2);
            c2.add(button3);
            c2.add(button4);
            c2.add(button5);



            c2.add(field1);
            c2.add(field2);
            c2.add(field3);
            c2.add(field4);
            c2.add(field5);


            JPanel panel2 = new JPanel();
            panel2.setLayout(null);
            panel2.setBounds(570, 10, 500, 465);
            panel2.setBackground(new Color(52, 152, 219));
            panel2.setBorder(BorderFactory.createTitledBorder("Patients Table"));
            panel2.add(new JScrollPane());

            DefaultTableModel tableModel2 = new DefaultTableModel(data, column);
            table2 = new JTable(tableModel2);
            panel2 = new JPanel();
            panel2.setLayout(null);
            panel2.setBounds(560, 120, 540, 465);
            panel2.setBackground(new Color(52, 152, 219));

            JScrollPane scrollPane = new JScrollPane(table2);
            scrollPane.setBounds(50, 20, 480, 350); // Set bounds for the scroll pane

            panel2.add(scrollPane);

            c2.add(panel2);

//........................................ Add

            button6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(field1.getText().toString().isEmpty() || field2.getText().toString().isEmpty() ||
                            field3.getText().toString().isEmpty()|| field4.getText().toString().isEmpty()||
                            field5.getText().toString().isEmpty() ){
                        JOptionPane.showMessageDialog(null, "Fill the fields", "Error",
                                JOptionPane.ERROR_MESSAGE);

                    }
                    else{
                        String task1 = field1.getText();
                        String task2 = field2.getText();
                        String task3 = field3.getText();
                        String task4 = field4.getText();
                        String task5 = field5.getText();
                        Object[] newTask = {task1,task2,task3,task4,task5};

                        tableModel2.addRow(newTask);
                        field1.setText(null);
                        field2.setText(null);
                        field3.setText(null);
                        field4.setText(null);
                        field5.setText(null);
                    }

                }
            });

            table2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int rowIndex = table2.getSelectedRow();
                    if (rowIndex >= 0) { // Check if a row is selected
                        int columnCount = tableModel2.getColumnCount();

                        Object[] rowData = new Object[columnCount];
                        for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
                            rowData[columnIndex] = tableModel2.getValueAt(rowIndex, columnIndex);
                        }


                        // Update the fields with the retrieved data
                        field1.setText(rowData[0] != null ? rowData[0].toString() : "");
                        field2.setText(rowData[1] != null ? rowData[1].toString() : "");
                        field3.setText(rowData[2] != null ? rowData[2].toString() : "");
                        field4.setText(rowData[3] != null ? rowData[3].toString() : "");
                        field5.setText(rowData[4] != null ? rowData[4].toString() : "");
                    }
                }
            });

            button7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (field1.getText().isEmpty() || field2.getText().isEmpty() || field3.getText().isEmpty()
                            || field4.getText().isEmpty() || field5.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Fill the fields", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        int row = table2.getSelectedRow();
                        if (row >= 0 && row < table2.getRowCount()) {
                            int columnCount = tableModel2.getColumnCount();
                            Object[] rowData = new Object[columnCount];

                            rowData[0] = field1.getText();
                            rowData[1] = field2.getText();
                            rowData[2] = field3.getText();
                            rowData[3] = field4.getText();
                            rowData[4] = field5.getText();

                            tableModel2.removeRow(row); // Remove the existing row
                            tableModel2.insertRow(row, rowData); // Insert the updated row

                            field1.setText(null);
                            field2.setText(null);
                            field3.setText(null);
                            field4.setText(null);
                            field5.setText(null);
                        } else {
                            JOptionPane.showMessageDialog(null, "Select a valid row", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });



//------------------------------------------ Delete

            button8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(table2.getSelectedRow() == -1){
                        JOptionPane.showMessageDialog(null, "Select the row please", "Error",
                                JOptionPane.ERROR_MESSAGE);


                    }

                    int select =  JOptionPane.showConfirmDialog(null, "Are you sure", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                    if(select == JOptionPane.YES_OPTION){
                        tableModel2.removeRow(table2.getSelectedRow());

                    }



                    field1.setText(null);
                    field2.setText(null);
                    field3.setText(null);
                    field4.setText(null);
                    field5.setText(null);

                }
            });


            c2.add(button6);
            c2.add(button7);
            c2.add(button8);

            c2.revalidate();
            frame4.setContentPane(c2);
            frame4.setVisible(true);
        }  else if (e.getActionCommand().equals("Add the Doctors")) {
            frame6 = new JFrame("Doctor's Stuff");
            frame6.setSize(1100, 700);
            frame6.setLocationRelativeTo(null);
            frame6.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            c4 = new JPanel();
            c4.setLayout(null);
            c4.setSize(800, 600);
            c4.setBackground(new Color(44, 62, 80));

            f1 = new JLabel("ID:");
            f1.setBounds(50, 150, 500, 50);
            f1.setFont(new Font("Arial", Font.BOLD, 25));
            f1.setForeground(new Color(255, 255, 255, 255));
            f2 = new JLabel("Name:");
            f2.setBounds(50, 250, 500, 50);
            f2.setFont(new Font("Arial", Font.BOLD, 25));
            f2.setForeground(new Color(255, 255, 255, 255));
            f3 = new JLabel("Specialization:");
            f3.setBounds(50, 350, 500, 50);
            f3.setFont(new Font("Arial", Font.BOLD, 25));
            f3.setForeground(new Color(255, 255, 255, 255));
            b4 = new JLabel("Contact:");
            b4.setBounds(50, 450, 500, 50);
            b4.setFont(new Font("Arial", Font.BOLD, 25));
            b4.setForeground(new Color(255, 255, 255, 255));
            b5 = new JLabel("Experience:");
            b5.setBounds(50, 550, 500, 50);
            b5.setFont(new Font("Arial", Font.BOLD, 25));
            b5.setForeground(new Color(255, 255, 255, 255));


            field9 = new JTextField();
            field9.setBounds(250, 163, 200, 25);
            field10 = new JTextField();
            field10.setBounds(250, 263, 200, 25);
            field11 = new JTextField();
            field11.setBounds(250, 363, 200, 25);
            field12 = new JTextField();
            field12.setBounds(250, 463, 200, 25);
            field13 = new JTextField();
            field13.setBounds(290, 561, 200, 25);

            box4 = new JComboBox(arr4);
            box4.addItemListener(this);
            box4.setBounds(205, 561, 80, 25);
            button9 = new JButton("Add");
            button10 = new JButton("Update");
            button11 = new JButton("Delete");

            button9.setBounds(555, 600, 120, 25);
            button10.setBounds(680, 600, 120, 25);
            button11.setBounds(805, 600, 120, 25);

            button9.setBackground(new Color(52, 152, 219)); // Blue color
            button10.setBackground(new Color(46, 204, 113)); // Green color
            button11.setBackground(new Color(231, 76, 60)); // Red color



            button9.setForeground(Color.white);
            button10.setForeground(Color.white);
            button11.setForeground(Color.white);

            c4.add(f1);
            c4.add(field9);
            c4.add(f2);
            c4.add(field10);
            c4.add(f3);
            c4.add(field11);
            c4.add(b4);
            c4.add(b5);
            c4.add(field12);
            c4.add(box4);
            c4.add(field13);







            JPanel panel3 = new JPanel();

            panel3.setBounds(570, 150, 500, 465);
            panel3.setBackground(new Color(52, 152, 219));
            panel3.setBorder(BorderFactory.createTitledBorder("Doctors Table"));
            panel3.add(new JScrollPane());

            DefaultTableModel tableModel1 = new DefaultTableModel(data2, column2);
            table1 = new JTable(tableModel1);
            panel3 = new JPanel();
            panel3.setLayout(null);
            panel3.setBounds(553, 158, 500, 400);
            panel3.setBackground(new Color(52, 152, 219));

            JScrollPane scrollPane = new JScrollPane(table1);
            scrollPane.setBounds(10, 20, 480, 350); // Set bounds for the scroll pane

            panel3.add(scrollPane);

            c4.add(panel3);

            heading3 = new JLabel("> Add the Doctor here  <");
            heading3.setBounds(280, 0, 500, 70);
            heading3.setFont(new Font("Arial", Font.BOLD, 40));
            heading3.setForeground(new Color(241, 201, 12, 255));

            c4.add(heading3);



//........................................ Add

            button9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (field9.getText().isEmpty() || field10.getText().isEmpty()
                            || field11.getText().isEmpty() || field12.getText().isEmpty()|| field13.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Fill in all the fields", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        String task1 = field9.getText();
                        String task2 = field10.getText();
                        String task3 = field11.getText();
                        String task4 = field12.getText();
                        String task5 = field13.getText();

                        Object[] newTask = {task1, task2, task3, task4, task5};

                        tableModel1.addRow(newTask);
                        field9.setText(null);
                        field10.setText(null);
                        field11.setText(null);
                        field12.setText(null);
                        field13.setText(null);
                    }
                }
            });


            table1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int rowIndex = table1.getSelectedRow();
                    if (rowIndex >= 0) { // Check if a row is selected
                        int columnCount = tableModel1.getColumnCount();

                        Object[] rowData = new Object[columnCount];
                        for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
                            rowData[columnIndex] = tableModel1.getValueAt(rowIndex, columnIndex);
                        }


                        // Update the fields with the retrieved data
                        field9.setText(rowData[0] != null ? rowData[0].toString() : "");
                        field10.setText(rowData[1] != null ? rowData[1].toString() : "");
                        field11.setText(rowData[2] != null ? rowData[2].toString() : "");
                        field12.setText(rowData[3] != null ? rowData[3].toString() : "");
                        field13.setText(rowData[4] != null ? rowData[4].toString() : "");

                    }
                }
            });

///---------------------------------- update

            button10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (field9.getText().isEmpty() || field10.getText().isEmpty() || field11.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Fill the fields", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        int row = table1.getSelectedRow();
                        if (row >= 0 && row < table1.getRowCount()) {
                            int columnCount = tableModel1.getColumnCount();
                            Object[] rowData = new Object[columnCount];

                            rowData[0] = field9.getText();
                            rowData[1] = field10.getText();
                            rowData[2] = field11.getText();
                            rowData[3] = field12.getText() ;
                            rowData[4] = field13.getText() ;


                            tableModel1.removeRow(row); // Remove the existing row
                            tableModel1.insertRow(row, rowData); // Insert the updated row

                            field9.setText(null);
                            field10.setText(null);
                            field11.setText(null);
                            field12.setText(null);
                            field13.setText(null);

                        } else {
                            JOptionPane.showMessageDialog(null, "Select a valid row", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            });



//........................................... delete

            button11.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(table1.getSelectedRow() == -1){
                        JOptionPane.showMessageDialog(null, "Select the row please", "Error",
                                JOptionPane.ERROR_MESSAGE);


                    }

                    int select =  JOptionPane.showConfirmDialog(null, "Are you sure", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                    if(select == JOptionPane.YES_OPTION){
                        tableModel1.removeRow(table1.getSelectedRow());

                    }



                    field9.setText(null);
                    field10.setText(null);
                    field11.setText(null);
                    field12.setText(null);
                    field13.setText(null);


                }
            });

            c4.add(button9);
            c4.add(button10);
            c4.add(button11);

            c4.revalidate();
            frame6.setContentPane(c4);

            frame6.setVisible(true);
        }

        else if (e.getSource() == submit) {
            String fieldValue6 = field6.getText();
            String fieldValue7 = field7.getText();
            String fieldValue8 = field8.getText();

            if (fieldValue6.isEmpty() || fieldValue7.isEmpty() || fieldValue8.isEmpty()) {
                // Not all fields are filled
                JOptionPane.showMessageDialog(frame3, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // All fields are filled
                StringBuilder message = new StringBuilder();
                message.append("Field 6: ").append(fieldValue6).append("\n");
                message.append("Field 7: ").append(fieldValue7).append("\n");
                message.append("Field 8: ").append(fieldValue8).append("\n");

                JOptionPane.showMessageDialog(frame3, message.toString(), "Confirmation", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        //......................................................end of submit button




    }




////////////////////        boxe1,2,3 and field6,7,8 and frame3
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == box1){
            if(e.getStateChange() == ItemEvent.SELECTED){
                String selecteditem = (String) box1.getSelectedItem();
                field6.setText(selecteditem);

            }
        }
        else if (e.getSource() == box2) {
            if(e.getStateChange() == ItemEvent.SELECTED){
                String selecteditem2 = (String) box2.getSelectedItem();
                field7.setText(selecteditem2);
            }

        }
        else if (e.getSource() == box3) {
            if(e.getStateChange() == ItemEvent.SELECTED){
                String selecteditem2 = (String) box3.getSelectedItem();
                field8.setText(selecteditem2);
            }

        } else if (e.getSource() == box4) {
            if(e.getStateChange() == ItemEvent.SELECTED){
                String selecteditem2 = (String) box4.getSelectedItem();
                field13.setText(selecteditem2);
            }

        }
    }





    private void displayscreen() {
        JWindow w1 = new JWindow(frame2);
        w1.setSize(482, 558);
        w1.setLocationRelativeTo(null);
        w1.setVisible(true);
        JLabel label2 = new JLabel("Welcome to Home-Screen");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Honey Script", Font.BOLD, 20));

        String path = "E:\\myjava\\folder1\\project\\Hospital management system\\src\\second.jpg";
        label1 = new JLabel(new ImageIcon(path));
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel1 = new JPanel();
        panel1.add(label2);
        panel1.add(label1);

        w1.add(panel1);
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel1.setLayout(new BorderLayout());


        panel1.setBackground(new Color(231, 76, 60));

        JProgressBar bar1 = new JProgressBar(1, 100);
        bar1.setForeground(Color.BLUE.brighter());
        w1.add(BorderLayout.PAGE_END, bar1);

        w1.revalidate();

        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = bar1.getValue();
                if (x == 100) {
                    w1.dispose();
                     frame2.setVisible(true);
                    timer.stop();
                } else {
                    bar1.setValue(x + 7);
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        new Main();
    }
}
