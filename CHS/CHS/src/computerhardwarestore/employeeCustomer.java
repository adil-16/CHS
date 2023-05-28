
package computerhardwarestore;

import java.sql.Statement;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class employeeCustomer extends javax.swing.JFrame {

    /**
     * Creates new form employeeCustomer
     */
    public employeeCustomer() throws SQLException {
        initComponents();
        jPanel3.hide();
        employeeCounter.setVisible(false);
        HighestSalaryCounter.setVisible(false);
        LowestSalaryCounter.setVisible(false);
        showmenu.setVisible(false);
        jComboBoxShop.setSelectedItem(shop);
        jComboBoxShop.setEnabled(false);
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File("D:\\employee.txt")));
            String st = "";
            while ((st = br.readLine()) != null){
                test = st;
                System.out.println(st);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
        Statement stmt = mycon.createStatement();
        ResultSet employeeBranch = stmt.executeQuery("select shop_branch from employee_details where employee_name='"+test+"'");
            while (employeeBranch.next()) {
                jComboBoxShop.setSelectedItem(employeeBranch.getString(1));
            }
        
    }
    
    String test = "";
    String oldNaming = "";
    String select_product = "";
    String update_category = "";
    String shop = "";
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");  
    Date date = new Date();    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LogoutSymbol = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        SubmitButton5 = new javax.swing.JButton();
        SubmitButton7 = new javax.swing.JButton();
        SubmitButton12 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        SubmitButton13 = new javax.swing.JButton();
        SubmitButton14 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Show = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        ProductName = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        tips = new javax.swing.JButton();
        JPrice = new javax.swing.JLabel();
        JCategory = new javax.swing.JLabel();
        JProductName = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jdevicetype = new javax.swing.JLabel();
        devicetype = new javax.swing.JTextField();
        jprocessor = new javax.swing.JLabel();
        processor = new javax.swing.JTextField();
        jgeneration = new javax.swing.JLabel();
        generation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxShop = new javax.swing.JComboBox<>();
        jbrand = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jquantity = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jyear = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jcustomer = new javax.swing.JLabel();
        customer = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        customername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        customerphone = new javax.swing.JTextField();
        jpayment = new javax.swing.JLabel();
        payment = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        HighestSalaryCounter = new javax.swing.JPanel();
        JHighestSalary = new javax.swing.JLabel();
        HighestSalary = new javax.swing.JLabel();
        employeeCounter = new javax.swing.JPanel();
        JTotalEmployees = new javax.swing.JLabel();
        employeeNo = new javax.swing.JLabel();
        LowestSalaryCounter = new javax.swing.JPanel();
        JLowestSalary = new javax.swing.JLabel();
        LowestSalary = new javax.swing.JLabel();
        showmenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Group 8 (1).png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DashBoard");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 10));

        LogoutSymbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jPanel4.add(LogoutSymbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 30, 40));

        SubmitButton.setBackground(new java.awt.Color(0, 51, 51));
        SubmitButton.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Log-Out");
        SubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitButton.setContentAreaFilled(false);
        SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButtonMouseClicked(evt);
            }
        });
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        jPanel4.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 110, 40));

        SubmitButton5.setBackground(new java.awt.Color(0, 51, 51));
        SubmitButton5.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        SubmitButton5.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton5.setText("Customer");
        SubmitButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitButton5.setContentAreaFilled(false);
        SubmitButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButton5MouseClicked(evt);
            }
        });
        SubmitButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(SubmitButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 170, -1));

        SubmitButton7.setBackground(new java.awt.Color(0, 51, 51));
        SubmitButton7.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        SubmitButton7.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton7.setText("Order");
        SubmitButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitButton7.setContentAreaFilled(false);
        SubmitButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButton7MouseClicked(evt);
            }
        });
        SubmitButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(SubmitButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 170, -1));

        SubmitButton12.setBackground(new java.awt.Color(0, 51, 51));
        SubmitButton12.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        SubmitButton12.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton12.setText("Payment");
        SubmitButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitButton12.setContentAreaFilled(false);
        SubmitButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButton12MouseClicked(evt);
            }
        });
        SubmitButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(SubmitButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 170, -1));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 300, -1));

        SubmitButton13.setBackground(new java.awt.Color(0, 51, 51));
        SubmitButton13.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        SubmitButton13.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton13.setText("Buy");
        SubmitButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitButton13.setContentAreaFilled(false);
        SubmitButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButton13MouseClicked(evt);
            }
        });
        SubmitButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton13ActionPerformed(evt);
            }
        });
        jPanel4.add(SubmitButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 170, -1));

        SubmitButton14.setBackground(new java.awt.Color(0, 51, 51));
        SubmitButton14.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        SubmitButton14.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton14.setText("Sell");
        SubmitButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitButton14.setContentAreaFilled(false);
        SubmitButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButton14MouseClicked(evt);
            }
        });
        SubmitButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButton14ActionPerformed(evt);
            }
        });
        jPanel4.add(SubmitButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 170, -1));

        jScrollPane2.setViewportView(jPanel4);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 600));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Group 8 (1).png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Show.setBackground(new java.awt.Color(255, 255, 255));
        Show.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Show.setForeground(new java.awt.Color(255, 255, 255));
        Show.setText("Show");
        Show.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Show.setContentAreaFilled(false);
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        jPanel3.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        Add.setBackground(new java.awt.Color(255, 255, 255));
        Add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Confirm");
        Add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add.setContentAreaFilled(false);
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel3.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        ProductName.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        ProductName.setForeground(new java.awt.Color(102, 102, 102));
        ProductName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });
        jPanel3.add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 28));

        Price.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Price.setForeground(new java.awt.Color(102, 102, 102));
        Price.setText("0");
        Price.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel3.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 180, 30));

        Search.setBackground(new java.awt.Color(255, 255, 255));
        Search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Search.setForeground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Search.setContentAreaFilled(false);
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel3.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        tips.setBackground(new java.awt.Color(204, 0, 0));
        tips.setText("Tips");
        tips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipsActionPerformed(evt);
            }
        });
        jPanel3.add(tips, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        JPrice.setText("Product Price");
        jPanel3.add(JPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        JCategory.setText("Category");
        jPanel3.add(JCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        JProductName.setText("Product Name");
        jPanel3.add(JProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 51, 51));
        jComboBox1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 180, -1));

        jdevicetype.setText("Device Type (if any)");
        jPanel3.add(jdevicetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        devicetype.setText("e.g Desktop");
        devicetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devicetypeActionPerformed(evt);
            }
        });
        jPanel3.add(devicetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, -1));

        jprocessor.setText("Processor (if any)");
        jPanel3.add(jprocessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        processor.setText("e.g. 3.0 GHz");
        jPanel3.add(processor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 100, -1));

        jgeneration.setText("Generation (if any)");
        jPanel3.add(jgeneration, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        generation.setText("e.g. 7");
        jPanel3.add(generation, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 120, -1));

        jLabel3.setText("Shop");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        jComboBoxShop.setBackground(new java.awt.Color(0, 51, 51));
        jComboBoxShop.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jComboBoxShop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rawalpindi", "Multan", "Karachi" }));
        jComboBoxShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxShopActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 180, -1));

        jbrand.setText("Brand");
        jPanel3.add(jbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        brand.setText("hp");
        jPanel3.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, -1));

        jquantity.setText("Quantity");
        jPanel3.add(jquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        quantity.setText("1");
        jPanel3.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 100, -1));

        jyear.setText("Manufacturing Year");
        jPanel3.add(jyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        year.setText("2020");
        jPanel3.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 130, -1));

        jcustomer.setText("Customer Action");
        jPanel3.add(jcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        customer.setBackground(new java.awt.Color(0, 51, 51));
        customer.setForeground(new java.awt.Color(0, 51, 51));
        customer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buy", "Sell" }));
        jPanel3.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 180, -1));

        jLabel4.setText("Customer Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanel3.add(customername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, -1));

        jLabel7.setText("Phone No.");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));
        jPanel3.add(customerphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, -1));

        jpayment.setText("Payment Type");
        jPanel3.add(jpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        payment.setBackground(new java.awt.Color(0, 51, 51));
        payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Debit Card" }));
        jPanel3.add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 180, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 420, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHSdb.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1790, -1));

        ProductTable.setBackground(new java.awt.Color(204, 255, 102));
        ProductTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ProductTable.setFont(new java.awt.Font("Agency FB", 0, 11)); // NOI18N
        ProductTable.setForeground(new java.awt.Color(102, 102, 0));
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category", "Price", "Name", "Device", "Processor", "Generation", "Type", "Size", "Color", "Model", "Brand", "Qnty"
            }
        ));
        ProductTable.setGridColor(new java.awt.Color(0, 102, 102));
        ProductTable.setRowHeight(24);
        ProductTable.setSelectionBackground(new java.awt.Color(0, 102, 102));
        ProductTable.setShowGrid(true);
        ProductTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ProductTableInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);
        if (ProductTable.getColumnModel().getColumnCount() > 0) {
            ProductTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            ProductTable.getColumnModel().getColumn(1).setPreferredWidth(120);
            ProductTable.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1090, 200));

        HighestSalaryCounter.setBackground(new java.awt.Color(0, 51, 51));

        JHighestSalary.setText("Highest Price");

        HighestSalary.setText("jLabel3");

        javax.swing.GroupLayout HighestSalaryCounterLayout = new javax.swing.GroupLayout(HighestSalaryCounter);
        HighestSalaryCounter.setLayout(HighestSalaryCounterLayout);
        HighestSalaryCounterLayout.setHorizontalGroup(
            HighestSalaryCounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HighestSalaryCounterLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(HighestSalaryCounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JHighestSalary)
                    .addComponent(HighestSalary))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        HighestSalaryCounterLayout.setVerticalGroup(
            HighestSalaryCounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HighestSalaryCounterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JHighestSalary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HighestSalary)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(HighestSalaryCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 220, 70));

        employeeCounter.setBackground(new java.awt.Color(0, 51, 51));

        JTotalEmployees.setText("Total Products");

        employeeNo.setText("jLabel4");

        javax.swing.GroupLayout employeeCounterLayout = new javax.swing.GroupLayout(employeeCounter);
        employeeCounter.setLayout(employeeCounterLayout);
        employeeCounterLayout.setHorizontalGroup(
            employeeCounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeCounterLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JTotalEmployees)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, employeeCounterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employeeNo)
                .addGap(40, 40, 40))
        );
        employeeCounterLayout.setVerticalGroup(
            employeeCounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeeCounterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTotalEmployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeNo)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(employeeCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, 70));

        LowestSalaryCounter.setBackground(new java.awt.Color(0, 51, 51));

        JLowestSalary.setText("Lowest Price");

        LowestSalary.setText("jLabel7");

        javax.swing.GroupLayout LowestSalaryCounterLayout = new javax.swing.GroupLayout(LowestSalaryCounter);
        LowestSalaryCounter.setLayout(LowestSalaryCounterLayout);
        LowestSalaryCounterLayout.setHorizontalGroup(
            LowestSalaryCounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowestSalaryCounterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(LowestSalaryCounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LowestSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LowestSalaryCounterLayout.createSequentialGroup()
                        .addComponent(JLowestSalary)
                        .addGap(0, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        LowestSalaryCounterLayout.setVerticalGroup(
            LowestSalaryCounterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LowestSalaryCounterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLowestSalary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LowestSalary)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(LowestSalaryCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 220, 60));

        showmenu.setText("Show Menu");
        showmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showmenuActionPerformed(evt);
            }
        });
        jPanel1.add(showmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DataBaseBG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1060));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jPanel4.hide();
        jScrollPane2.hide();
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButtonMouseClicked
        new signIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SubmitButtonMouseClicked

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void SubmitButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButton5MouseClicked
        try {
            // TODO add your handling code here:
            new employeeCustomer().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(employeeCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_SubmitButton5MouseClicked

    private void SubmitButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButton5ActionPerformed

    private void SubmitButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButton7MouseClicked
        // TODO add your handling code here:
        new employeeOrder().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_SubmitButton7MouseClicked

    private void SubmitButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButton7ActionPerformed

    private void SubmitButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButton12MouseClicked
        // TODO add your handling code here:
        new employeePayment().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SubmitButton12MouseClicked

    private void SubmitButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButton12ActionPerformed

    private void SubmitButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButton13MouseClicked
        // TODO add your handling code here:
        new employeeBuy().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SubmitButton13MouseClicked

    private void SubmitButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButton13ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jPanel3.hide();
        jPanel4.setVisible(true);
        jScrollPane2.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jPanel4.hide();
        jScrollPane2.hide();
        jPanel3.setVisible(true);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void SubmitButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButton14MouseClicked
        // TODO add your handling code here:
         new employeeSell().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_SubmitButton14MouseClicked

    private void SubmitButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitButton14ActionPerformed

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowMouseClicked

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        try {
            showmenu.setVisible(true);
            jPanel3.setVisible(false);
            HighestSalaryCounter.setVisible(true);
            employeeCounter.setVisible(true);
            LowestSalaryCounter.setVisible(true);
            Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            Statement stmt = mycon.createStatement();
            ProductTable.setFont(new Font("Serif", Font.BOLD, 15));
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();

            model.setRowCount(0);
            ResultSet result11 = stmt.executeQuery("select product.product_id,product.product_category,product.product_price,product.product_name,computer.device_type,computer.processor,computer.generation,brand_manufacturer.brand_name,product.product_quantity from product join computer on computer.product_id = product.product_id join manufactures on product.product_id = manufactures.product_product_id join brand_manufacturer on manufactures.brand_manufacturer_brand_id = brand_manufacturer.brand_id");
            while (result11.next()) {
                model.addRow(new Object[]{result11.getInt(1),result11.getString(2),result11.getString(3),result11.getString(4),result11.getString(5),result11.getString(6),result11.getString(7),null,null,null,null,result11.getString(8),result11.getString(9)});
            }

            ResultSet result = stmt.executeQuery("select product.product_id,product.product_category,product.product_price,product.product_name,components.\"Size\", components.type,brand_manufacturer.brand_name,product.product_quantity from product join components on components.product_id = product.product_id join manufactures on product.product_id = manufactures.product_product_id join brand_manufacturer on manufactures.brand_manufacturer_brand_id = brand_manufacturer.brand_id");
            while (result.next()) {
                System.out.println(result.getInt(1)+"   "+result.getString(2)+"   "+result.getInt(3)+"   "+result.getString(4)+"   "+result.getString(5)+"   "+result.getString(6));
                model.addRow(new Object[]{result.getInt(1),result.getString(2),result.getString(3),result.getString(4),null,null,null,result.getString(6),result.getString(5),null,null,result.getString(7),result.getString(8)});
            }
            ResultSet result22 = stmt.executeQuery("select product.product_id,product.product_category,product.product_price,product.product_name,accessories.accessory_model,accessories.accessory_color,brand_manufacturer.brand_name,product.product_quantity from product join accessories on accessories.product_id = product.product_id join manufactures on product.product_id = manufactures.product_product_id join brand_manufacturer on manufactures.brand_manufacturer_brand_id = brand_manufacturer.brand_id");
            while (result22.next()) {
                model.addRow(new Object[]{result22.getInt(1),result22.getString(2),result22.getString(3),result22.getString(4),null,null,null,null,null,result22.getString(6),result22.getString(5),result22.getString(7),result22.getString(8)});
            }

            ResultSet result2 = stmt.executeQuery("select count(*) from product");
            employeeCounter.setVisible(true);
            JTotalEmployees.setFont(new Font("Serif", Font.BOLD, 15));
            employeeNo.setFont(new Font("Serif", Font.BOLD, 20));
            JTotalEmployees.setForeground(Color.white);
            employeeNo.setForeground(Color.white);
            employeeNo. setHorizontalAlignment(JLabel. CENTER);
            while(result2.next()){
                String count = result2.getString(1);
                employeeNo.setText(count);
            }
            ResultSet result3 = stmt.executeQuery("select product_name,product_price from product where product_price in (select max(product_price) from product)");
            HighestSalaryCounter.setVisible(true);
            System.out.println("yaha ara ha");
            JHighestSalary.setFont(new Font("Serif", Font.BOLD, 15));
            HighestSalary.setFont(new Font("Serif", Font.BOLD, 20));
            JHighestSalary.setForeground(Color.white);
            HighestSalary.setForeground(Color.white);
            HighestSalary. setHorizontalAlignment(JLabel. CENTER);
            while(result3.next()){
                String name="";
                String salary = "";
                name = result3.getString(1);
                salary = result3.getString(2);
                HighestSalary.setText(name+" : "+salary);
            }

            ResultSet result4 = stmt.executeQuery("select product_name,product_price from product where product_price in (select min(product_price) from product)");
            LowestSalaryCounter.setVisible(true);
            JLowestSalary.setFont(new Font("Serif", Font.BOLD, 15));
            LowestSalary.setFont(new Font("Serif", Font.BOLD, 20));
            JLowestSalary.setForeground(Color.white);
            LowestSalary.setForeground(Color.white);
            LowestSalary. setHorizontalAlignment(JLabel. CENTER);
            while(result4.next()){
                String name="";
                String salary = "";
                name = result4.getString(1);
                salary = result4.getString(2);
                LowestSalary.setText(name+" : "+salary);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_ShowActionPerformed

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        try {
            String name = "";
            String user_name  = "";
            String user_password = "";
            int salary = 0;
            String shop = "";
            name = ProductName.getText();
            salary = Integer.parseInt(Price.getText());
            int productId = 1;
            int brandId = 1;
            int customerId=1;
            int orderId = 1;
            int orderitemId=1;
            int paymentId=1;
            int total_price=1;
            Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            Statement stmt = mycon.createStatement();
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yy");
            if(customer.getSelectedItem().equals("Buy")){
                
                ResultSet orderCount = stmt.executeQuery("select order_id from orders");
                while (orderCount.next()) {
                if(orderId==orderCount.getInt(1)){
                    orderId++;
                    System.out.println("order Id:"+orderId);
                }
                }
                System.out.println("orders");
                
                ResultSet orderitemCount = stmt.executeQuery("select orderitems_id from order_items");
                while (orderitemCount.next()) {
                if(orderitemId==orderitemCount.getInt(1)){
                    orderitemId++;
                    System.out.println("order item Id:"+orderitemId);
                }
                }
                System.out.println("order items");
                
                ResultSet paymentCount = stmt.executeQuery("select payment_id from payment");
                while (paymentCount.next()) {
                if(paymentId==paymentCount.getInt(1)){
                    paymentId++;
                    System.out.println("payment Id:"+paymentId);
                }
                }
                System.out.println("payment");
                boolean customerExists = false;
                ResultSet customerCount = stmt.executeQuery("select customer_id,customer_name from customer");
                while (customerCount.next()) {
                    if(customername.getText().equals(customerCount.getString(2))){
                        customerExists = true;
                        customerId = customerCount.getInt(1);
                        System.out.println("customer found");
                        break;
                    }
                    else{
                        if(customerId==customerCount.getInt(1)){
                            customerId++;
                            System.out.println("product Id:"+customerId);
                        }
                    }
                }
                boolean productFound = false;
                ResultSet customerBuy = stmt.executeQuery("select product_id,product_quantity from product where product_id='"+ProductName.getText()+"'");
                
                while(customerBuy.next()){
                    int num = Integer.parseInt(customerBuy.getString(2));
                    if(num>1){
                        int diff1 = Integer.parseInt(customerBuy.getString(2));
                        int diff2 = Integer.parseInt(quantity.getText());
                        int diff3 =  diff1-diff2;
                        if(diff3>=0){
                            String diff = String.valueOf(diff3);
                            stmt.executeUpdate("update product set product_quantity = '"+diff+"' where product_id='"+ProductName.getText()+"'");   
                            System.out.println("update");
                            productFound=true;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Not Enough Quantity");
                        }
                    }
                    else if(num==1){
                        stmt.executeUpdate("Delete from product where product_id='"+ProductName.getText()+"'");
                        System.out.println("delete");
                        productFound=true;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Not Enough Quantity");
                    }
                }
                if(productFound==false){
                    JOptionPane.showMessageDialog(null, "Invalid Product ID");
                }
                else{
                    System.out.println("1");
                    if(customerExists==false){
                        stmt.executeUpdate("Insert into customer values('"+customerId+"','"+customername.getText()+"','"+customerphone.getText()+"')");
                    }
                    int totalPrice1 = Integer.parseInt(Price.getText());
                    int totalPrice2 = Integer.parseInt(quantity.getText());
                    int totalPrice = totalPrice1 * totalPrice2;
                    System.out.println("2");
                    stmt.executeUpdate("Insert into buys values('"+customerId+"',"+productId+")");
                    System.out.println("3");
                    stmt.executeUpdate("Insert into orders values('"+orderId+"','"+dateFormat.format(date)+"',"+customerId+",'"+totalPrice+"')");
                    System.out.println("4");
                    stmt.executeUpdate("Insert into order_items values('"+orderitemId+"',"+productId+","+orderId+")");
                    System.out.println("5");
                    stmt.executeUpdate("Insert into payment values('"+paymentId+"','"+payment.getSelectedItem()+"','"+dateFormat.format(date)+"',"+orderId+")");
                    System.out.println("6");
                }
            }
           
            else if (customer.getSelectedItem().equals("Sell")){
                boolean customerExists = false;
                ResultSet customerCount = stmt.executeQuery("select customer_id,customer_name from customer");
                while (customerCount.next()) {
                if(customername.getText().equals(customerCount.getString(2))){
                    customerExists = true;
                        customerId = customerCount.getInt(1);
                        break;
                    }
                else{
                    if(customerId==customerCount.getInt(1)){
                        customerId++;
                        System.out.println("product Id:"+customerId);
                    }
                }
            }
                
                ResultSet orderCount = stmt.executeQuery("select order_id from orders");
                while (orderCount.next()) {
                if(orderId==orderCount.getInt(1)){
                    orderId++;
                    System.out.println("order Id:"+orderId);
                }
                }
                
                ResultSet orderitemCount = stmt.executeQuery("select orderitems_id from order_items");
                while (orderitemCount.next()) {
                if(orderitemId==orderitemCount.getInt(1)){
                    orderitemId++;
                    System.out.println("order item Id:"+orderitemId);
                }
                }
                
                ResultSet paymentCount = stmt.executeQuery("select payment_id from payment");
                while (paymentCount.next()) {
                if(paymentId==paymentCount.getInt(1)){
                    paymentId++;
                    System.out.println("payment Id:"+paymentId);
                }
                }
                
                ResultSet checkComputer = stmt.executeQuery("select product.product_id,product.product_category,product.product_price,product.product_name,computer.device_type,computer.processor,computer.generation,brand_manufacturer.brand_name,product.product_quantity, brand_manufacturer.manufaturing_year from product join computer on computer.product_id = product.product_id join manufactures on product.product_id = manufactures.product_product_id join brand_manufacturer on manufactures.brand_manufacturer_brand_id = brand_manufacturer.brand_id");
                boolean increment_value = false;
                while(checkComputer.next()){
                    System.out.println(checkComputer.getString(4));
                    if(ProductName.getText().equalsIgnoreCase(checkComputer.getString(4)) && brand.getText().equalsIgnoreCase(checkComputer.getString(8)) && year.getText().equalsIgnoreCase(checkComputer.getString(10)) && devicetype.getText().equalsIgnoreCase(checkComputer.getString(5)) && processor.getText().equalsIgnoreCase(checkComputer.getString(6)) && generation.getText().equalsIgnoreCase(checkComputer.getString(7))){
                        increment_value = true;
                        int add1 = Integer.parseInt(quantity.getText());
                        int add2 = Integer.parseInt(checkComputer.getString(9));
                        int add = add1+add2;
                        System.out.println(add);
                        stmt.executeQuery("update product set product.product_quantity = '"+add+"' where product_id="+checkComputer.getString(1)+"");
                        System.out.println("1");
                        if(customerExists==false){
                            stmt.executeUpdate("Insert into customer values('"+customerId+"','"+customername.getText()+"','"+customerphone.getText()+"')");
                        }
                        System.out.println("2");
                        stmt.executeUpdate("Insert into buys values('"+customerId+"',"+productId+")");
                        System.out.println("3");
                        int totalPrice1 = Integer.parseInt(Price.getText());
                        int totalPrice2 = Integer.parseInt(quantity.getText());
                        int totalPrice = totalPrice1 * totalPrice2;
                        stmt.executeUpdate("Insert into orders values('"+orderId+"','"+dateFormat.format(date)+"',"+customerId+",'"+totalPrice+"')");
                        System.out.println("4");
                        stmt.executeUpdate("Insert into order_items values('"+orderitemId+"',"+productId+","+orderId+")");
                        System.out.println("5");
                        stmt.executeUpdate("Insert into payment values('"+paymentId+"','"+payment.getSelectedItem()+"','"+dateFormat.format(date)+"',"+orderId+")");
                        System.out.println("6");
                    }
                }
                
                if(increment_value == false){
                ResultSet productCount = stmt.executeQuery("select product_id from product");
                while (productCount.next()) {
                if(productId==productCount.getInt(1)){
                    productId++;
                    System.out.println("product Id:"+productId);
                }
                else if(productId!=productCount.getInt(1)){
                    break;
                }
            }
            boolean brandfound=false;
            ResultSet brandCount = stmt.executeQuery("select * from brand_manufacturer");
            while (brandCount.next()) {
                if(brand.getText().equalsIgnoreCase(brandCount.getString(2))){
                    brandId = brandCount.getInt(1);
                    brandfound = true;
                }
                else if(brandId==brandCount.getInt(1)){
                    brandId++;
                    System.out.println("brand Id:"+brandId);
                }
                else if(brandId!=brandCount.getInt(1)){
                    break;
                }
            }
            int shopId=1;
            ResultSet shopCount = stmt.executeQuery("select shop_id,shop_branch from shop");
            while(shopCount.next()){
                if(shop.equalsIgnoreCase(shopCount.getString(2))){
                    shopId = shopCount.getInt(1);
                }
            }
            if(!devicetype.getText().equals("e.g Desktop") && !generation.getText().equals("e.g. 7") && !processor.getText().equals("e.g. 3.0 GHz")){
                stmt.executeUpdate("Insert into product values('"+productId+"', '" + jComboBox1.getSelectedItem() + "', '" + salary + "', '" + name + "', '" + quantity.getText() + "')");
                
                stmt.executeUpdate("Insert into computer values('"+productId+"', '" + devicetype.getText() + "', '" + processor.getText() + "', '" + generation.getText() + "')");
                if(brandfound==false){
                    stmt.executeUpdate("Insert into brand_manufacturer values('"+brandId+"','"+brand.getText()+"','"+year.getText()+"')");
                }
                stmt.executeUpdate("Insert into manufactures values("+brandId+","+productId+")");
                stmt.executeUpdate("Insert into hasv2 values("+shopId+","+productId+")");
                System.out.println("1");
                if(customerExists==false){
                    stmt.executeUpdate("Insert into customer values('"+customerId+"','"+customername.getText()+"','"+customerphone.getText()+"')");
                }
                
                System.out.println("2");
                stmt.executeUpdate("Insert into sells values('"+customerId+"',"+productId+")");
                System.out.println("3");
                int totalPrice1 = Integer.parseInt(Price.getText());
                int totalPrice2 = Integer.parseInt(quantity.getText());
                int totalPrice = totalPrice1 * totalPrice2;
                stmt.executeUpdate("Insert into orders values('"+orderId+"','"+dateFormat.format(date)+"',"+customerId+",'"+totalPrice+"')");
                System.out.println("4");
                stmt.executeUpdate("Insert into order_items values('"+orderitemId+"',"+productId+","+orderId+")");
                System.out.println("5");
                stmt.executeUpdate("Insert into payment values('"+paymentId+"','"+payment.getSelectedItem()+"','"+dateFormat.format(date)+"',"+orderId+")");
                System.out.println("6");
            }

            
            else{
                JOptionPane.showMessageDialog(null, "Please Enter Correct Details");
            }
            }
            }
            
            devicetype.setText("e.g Desktop");
            generation.setText("e.g. 7");
            processor.setText("e.g. 3.0 GHz");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        ProductName.setText("");
        Price.setText("0");
    }//GEN-LAST:event_AddMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked

    }//GEN-LAST:event_SearchMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        try {
            showmenu.setVisible(true);
            ProductTable.setVisible(true);
            jPanel3.setVisible(false);
            String name = "";
            name = ProductName.getText();

            if(((!ProductName.getText().equals("") && Price.getText().equals("0")))
                || ((ProductName.getText().equals("") && !Price.getText().equals("0")))
            ){
                Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
                Statement stmt = mycon.createStatement();
                ProductTable.setFont(new Font("Serif", Font.BOLD, 15));
                DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
                model.setRowCount(0);
                ResultSet result=null;
                if(!ProductName.getText().equals("") && jComboBox1.getSelectedItem().equals("Computer")){
                    result = stmt.executeQuery("select * from product join computer on product.product_id=computer.product_id where product_name='"+ProductName.getText()+"'");
                }
                else if(!Price.getText().equals("0") && jComboBox1.getSelectedItem().equals("Computer")){
                    result = stmt.executeQuery("select * from product join computer on computer.product_id = product.product_id where product_price="+Price.getText()+"");
                }
                else if(!ProductName.getText().equals("") && jComboBox1.getSelectedItem().equals("Components")){
                    result = stmt.executeQuery("select * from product join components on product.product_id=components.product_id where product_name='"+ProductName.getText()+"'");
                }
                else if(!Price.getText().equals("0") && jComboBox1.getSelectedItem().equals("Components")){
                    result = stmt.executeQuery("select * from product join components on components.product_id = product.product_id where product_price="+Price.getText()+"");
                }
                else if(!ProductName.getText().equals("") && jComboBox1.getSelectedItem().equals("Accessories")){
                    result = stmt.executeQuery("select * from product join accessories on product.product_id=accessories.product_id where product_name='"+ProductName.getText()+"'");
                }
                else if(!Price.getText().equals("0") && jComboBox1.getSelectedItem().equals("Accessories")){
                    result = stmt.executeQuery("select * from product join accessories on accessories.product_id = product.product_id where product_price="+Price.getText()+"");
                }
                int count = 0;
                while (result.next()) {
                    System.out.println(result.getInt(1)+"   "+result.getString(2)+"   "+result.getInt(3)+"   "+result.getString(4)+"   "+result.getInt(5)+" "+result.getString(6));
                    if(jComboBox1.getSelectedItem().equals("Computer")){
                        model.addRow(new Object[]{result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(6),result.getString(7),result.getString(8),null,null,null,null});
                        count++;
                    }

                    else if(jComboBox1.getSelectedItem().equals("Components")){
                        model.addRow(new Object[]{result.getInt(1),result.getString(2),result.getString(3),result.getString(4),null,null,null,result.getString(7),result.getString(6),null,null});
                        count++;
                    }
                    else if(jComboBox1.getSelectedItem().equals("Accessories")){
                        model.addRow(new Object[]{result.getInt(1),result.getString(2),result.getString(3),result.getString(4),null,null,null,null,null,result.getString(7),result.getString(6)});
                        count++;
                    }

                }
                if(count==0){
                    JOptionPane.showMessageDialog(null,"No Record Found for "+name);
                }
                else if(count!=0 && (!ProductName.getText().equals("") || !Price.getText().equals("0"))){
                    JOptionPane.showMessageDialog(null,"Record Found for "+name);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Enter Only 1 Field To Search");
                ProductName.setText("");
                Price.setText("0");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void tipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipsActionPerformed
        JOptionPane.showMessageDialog(null,"Enter Product ID In Name Field To Buy");
    }//GEN-LAST:event_tipsActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        select_product = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void devicetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devicetypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_devicetypeActionPerformed

    private void jComboBoxShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxShopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxShopActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void ProductTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ProductTableInputMethodTextChanged

    }//GEN-LAST:event_ProductTableInputMethodTextChanged

    private void showmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showmenuActionPerformed
        showmenu.setVisible(false);
        jPanel3.setVisible(true);
        HighestSalaryCounter.setVisible(false);
        employeeCounter.setVisible(false);
        LowestSalaryCounter.setVisible(false);
    }//GEN-LAST:event_showmenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(employeeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new employeeCustomer().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(employeeCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel HighestSalary;
    private javax.swing.JPanel HighestSalaryCounter;
    private javax.swing.JLabel JCategory;
    private javax.swing.JLabel JHighestSalary;
    private javax.swing.JLabel JLowestSalary;
    private javax.swing.JLabel JPrice;
    private javax.swing.JLabel JProductName;
    private javax.swing.JLabel JTotalEmployees;
    private javax.swing.JLabel LogoutSymbol;
    private javax.swing.JLabel LowestSalary;
    private javax.swing.JPanel LowestSalaryCounter;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton Search;
    private javax.swing.JButton Show;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton SubmitButton12;
    private javax.swing.JButton SubmitButton13;
    private javax.swing.JButton SubmitButton14;
    private javax.swing.JButton SubmitButton5;
    private javax.swing.JButton SubmitButton7;
    private javax.swing.JTextField brand;
    private javax.swing.JComboBox<String> customer;
    private javax.swing.JTextField customername;
    private javax.swing.JTextField customerphone;
    private javax.swing.JTextField devicetype;
    private javax.swing.JPanel employeeCounter;
    private javax.swing.JLabel employeeNo;
    private javax.swing.JTextField generation;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxShop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jbrand;
    private javax.swing.JLabel jcustomer;
    private javax.swing.JLabel jdevicetype;
    private javax.swing.JLabel jgeneration;
    private javax.swing.JLabel jpayment;
    private javax.swing.JLabel jprocessor;
    private javax.swing.JLabel jquantity;
    private javax.swing.JLabel jyear;
    private javax.swing.JComboBox<String> payment;
    private javax.swing.JTextField processor;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton showmenu;
    private javax.swing.JButton tips;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
