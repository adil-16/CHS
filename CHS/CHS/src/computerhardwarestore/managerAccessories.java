
package computerhardwarestore;

import java.sql.Statement;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class managerAccessories extends javax.swing.JFrame {

    /**
     * Creates new form managerAccessories
     */
    public managerAccessories() {
        initComponents();
        jPanel3.hide();
        jLabel10.hide();
        Components.hide();
        Computer.hide();
        Accessories.show();
        brandManu.hide();
        Delete1.setVisible(false);
        Update1.setVisible(false);
        employeeCounter.setVisible(false);
        HighestSalaryCounter.setVisible(false);
        LowestSalaryCounter.setVisible(false);
        showmenu.setVisible(false);
        
        try{
    BufferedReader br = new BufferedReader(new FileReader(new File("D:\\branch.txt")));
            String st = "";
            while ((st = br.readLine()) != null){
                shop = st;
            }
    }
    catch(Exception e){
        System.out.println(e);
    }
    
    jComboBoxShop.setSelectedItem(shop);
    jComboBoxShop.setEnabled(false);
    }
    String oldNaming = "";
    String select_product = "";
    String update_category = "";
    String shop = "";

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LogoutSymbol = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Products = new javax.swing.JButton();
        Employee = new javax.swing.JButton();
        brandManu = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        shop1 = new javax.swing.JButton();
        Accessories = new javax.swing.JButton();
        Computer = new javax.swing.JButton();
        Components = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Show = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        ProductName = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Update22 = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        tips = new javax.swing.JButton();
        JPrice = new javax.swing.JLabel();
        JCategory = new javax.swing.JLabel();
        JProductName = new javax.swing.JLabel();
        Delete1 = new javax.swing.JButton();
        Update1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jmodel = new javax.swing.JLabel();
        modell = new javax.swing.JTextField();
        jcolor = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxShop = new javax.swing.JComboBox<>();
        jbrand = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jquantity = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jyear = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DataBaseBG.png"))); // NOI18N
        jLabel12.setText("jLabel1");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

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
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 300, -1));

        Products.setBackground(new java.awt.Color(0, 51, 51));
        Products.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        Products.setForeground(new java.awt.Color(255, 255, 255));
        Products.setText("Products");
        Products.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Products.setContentAreaFilled(false);
        Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsMouseClicked(evt);
            }
        });
        Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsActionPerformed(evt);
            }
        });
        jPanel4.add(Products, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, -1));

        Employee.setBackground(new java.awt.Color(0, 51, 51));
        Employee.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        Employee.setForeground(new java.awt.Color(255, 255, 255));
        Employee.setText("Employee");
        Employee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Employee.setContentAreaFilled(false);
        Employee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeMouseClicked(evt);
            }
        });
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });
        jPanel4.add(Employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 170, -1));

        brandManu.setBackground(new java.awt.Color(0, 51, 51));
        brandManu.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        brandManu.setForeground(new java.awt.Color(255, 255, 255));
        brandManu.setText("Manufacturer");
        brandManu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brandManu.setContentAreaFilled(false);
        brandManu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandManuMouseClicked(evt);
            }
        });
        brandManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandManuActionPerformed(evt);
            }
        });
        jPanel4.add(brandManu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 170, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        shop1.setBackground(new java.awt.Color(0, 51, 51));
        shop1.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        shop1.setForeground(new java.awt.Color(255, 255, 255));
        shop1.setText("Shop");
        shop1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shop1.setContentAreaFilled(false);
        shop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shop1MouseClicked(evt);
            }
        });
        shop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shop1ActionPerformed(evt);
            }
        });
        jPanel4.add(shop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 170, -1));

        Accessories.setBackground(new java.awt.Color(0, 51, 51));
        Accessories.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        Accessories.setForeground(new java.awt.Color(255, 255, 255));
        Accessories.setText("Accessories");
        Accessories.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Accessories.setContentAreaFilled(false);
        Accessories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccessoriesMouseClicked(evt);
            }
        });
        Accessories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccessoriesActionPerformed(evt);
            }
        });
        jPanel4.add(Accessories, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 170, -1));

        Computer.setBackground(new java.awt.Color(0, 51, 51));
        Computer.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        Computer.setForeground(new java.awt.Color(255, 255, 255));
        Computer.setText("Computer");
        Computer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Computer.setContentAreaFilled(false);
        Computer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComputerMouseClicked(evt);
            }
        });
        Computer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputerActionPerformed(evt);
            }
        });
        jPanel4.add(Computer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 170, -1));

        Components.setBackground(new java.awt.Color(0, 51, 51));
        Components.setFont(new java.awt.Font("Agency FB", 0, 28)); // NOI18N
        Components.setForeground(new java.awt.Color(255, 255, 255));
        Components.setText("Components");
        Components.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Components.setContentAreaFilled(false);
        Components.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComponentsMouseClicked(evt);
            }
        });
        Components.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComponentsActionPerformed(evt);
            }
        });
        jPanel4.add(Components, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 170, -1));

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
        jPanel3.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        Add.setBackground(new java.awt.Color(255, 255, 255));
        Add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
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
        jPanel3.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        Delete.setBackground(new java.awt.Color(255, 255, 255));
        Delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete.setContentAreaFilled(false);
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel3.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        ProductName.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        ProductName.setForeground(new java.awt.Color(102, 102, 102));
        ProductName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });
        jPanel3.add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 28));

        Price.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        Price.setForeground(new java.awt.Color(102, 102, 102));
        Price.setText("0");
        Price.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        jPanel3.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 180, 30));

        Update22.setBackground(new java.awt.Color(255, 255, 255));
        Update22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Update22.setForeground(new java.awt.Color(255, 255, 255));
        Update22.setText("Update");
        Update22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Update22.setContentAreaFilled(false);
        Update22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update22MouseClicked(evt);
            }
        });
        Update22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update22ActionPerformed(evt);
            }
        });
        jPanel3.add(Update22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

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
        jPanel3.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        tips.setBackground(new java.awt.Color(204, 0, 0));
        tips.setText("Tips");
        tips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipsActionPerformed(evt);
            }
        });
        jPanel3.add(tips, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        JPrice.setText("Product Price");
        jPanel3.add(JPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        JCategory.setText("Category");
        jPanel3.add(JCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        JProductName.setText("Product Name");
        jPanel3.add(JProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Delete1.setBackground(new java.awt.Color(153, 0, 0));
        Delete1.setText("Remove");
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });
        jPanel3.add(Delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));

        Update1.setBackground(new java.awt.Color(0, 51, 51));
        Update1.setText("Update");
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });
        jPanel3.add(Update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 51, 51));
        jComboBox1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accessories" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, -1));

        jmodel.setText("Model (if any)");
        jPanel3.add(jmodel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        modell.setText("e.g. 6 series");
        jPanel3.add(modell, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 180, -1));

        jcolor.setText("Color (if any)");
        jPanel3.add(jcolor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        color.setText("e.g. Black");
        jPanel3.add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 170, -1));

        jLabel3.setText("Shop");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jComboBoxShop.setBackground(new java.awt.Color(0, 51, 51));
        jComboBoxShop.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jComboBoxShop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rawalpindi", "Multan", "Karachi" }));
        jComboBoxShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxShopActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBoxShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 180, -1));

        jbrand.setText("Brand");
        jPanel3.add(jbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        brand.setText("hp");
        jPanel3.add(brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jquantity.setText("Quantity");
        jPanel3.add(jquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        quantity.setText("1");
        jPanel3.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, -1));

        jyear.setText("Manufacturing Year");
        jPanel3.add(jyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        year.setText("2020");
        jPanel3.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 420, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CHSdb.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1790, -1));

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
            ProductTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            ProductTable.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1090, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DataBaseBG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -270, -1, 1060));

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

    private void ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseClicked
        // TODO add your handling code here:
        new managerProduct().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductsMouseClicked

    private void ProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsActionPerformed

    private void EmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeMouseClicked
        // TODO add your handling code here:
        new managerEmployee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmployeeMouseClicked

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeActionPerformed

    private void brandManuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandManuMouseClicked
        // TODO add your handling code here:
        new brandManufacturer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brandManuMouseClicked

    private void brandManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandManuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandManuActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jLabel10.setVisible(true);
        jLabel9.hide();
        Components.hide();
        Computer.hide();
        Accessories.hide();
        brandManu.hide();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        jLabel10.hide();
        brandManu.setVisible(true);
        Accessories.setVisible(true);
        jLabel9.setVisible(true);
        Components.setVisible(true);
        Computer .setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void shop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shop1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_shop1MouseClicked

    private void shop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shop1ActionPerformed
        
    }//GEN-LAST:event_shop1ActionPerformed

    private void AccessoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccessoriesMouseClicked
        // TODO add your handling code here:
        new managerAccessories().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AccessoriesMouseClicked

    private void AccessoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccessoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccessoriesActionPerformed

    private void ComputerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComputerMouseClicked
        // TODO add your handling code here:
        new managerComputer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ComputerMouseClicked

    private void ComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComputerActionPerformed

    private void ComponentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComponentsMouseClicked
        // TODO add your handling code here:
        new managerComponents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ComponentsMouseClicked

    private void ComponentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComponentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComponentsActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jPanel3.hide();
        jPanel4.setVisible(true);
        jScrollPane2.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        jPanel4.hide();
        jScrollPane2.hide();
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jPanel4.hide();
        jScrollPane2.hide();
        jPanel3.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            
            ResultSet result22 = stmt.executeQuery("select product.product_id,product.product_category,product.product_price,product.product_name,accessories.accessory_model,accessories.accessory_color,brand_manufacturer.brand_name,product.product_quantity from product join accessories on accessories.product_id = product.product_id join manufactures on product.product_id = manufactures.product_product_id join brand_manufacturer on manufactures.brand_manufacturer_brand_id = brand_manufacturer.brand_id");
            while (result22.next()) {
                model.addRow(new Object[]{result22.getInt(1),result22.getString(2),result22.getString(3),result22.getString(4),null,null,null,null,null,result22.getString(6),result22.getString(5),result22.getString(7),result22.getString(8)});
            }

            ResultSet result2 = stmt.executeQuery("select count(*) from product where product_category='Accessories'");
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
            ResultSet result3 = stmt.executeQuery("select product_name,product_price from product where product_price in (select max(product_price) from product where product_category='Accessories')");
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

            ResultSet result4 = stmt.executeQuery("select product_name,product_price from product where product_price in (select min(product_price) from product where product_category='Accessories')");
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
            Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            Statement stmt = mycon.createStatement();
            Statement stmt1 = mycon.createStatement();
            Statement stmt2 = mycon.createStatement();
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

            if(!color.getText().equals("e.g. Black") && !modell.getText().equals("e.g. 6 series") ){
                stmt.executeUpdate("Insert into product values('"+productId+"', '" + jComboBox1.getSelectedItem() + "', '" + salary + "', '" + name + "', '" + quantity.getText() + "')");
                stmt.executeUpdate("Insert into accessories values('"+productId+"', '" + modell.getText() + "', '" + color.getText() + "')");
                if(brandfound==false){
                    stmt.executeUpdate("Insert into brand_manufacturer values('"+brandId+"','"+brand.getText()+"','"+year.getText()+"')");
                }
                stmt.executeUpdate("Insert into manufactures values('"+brandId+"','"+productId+"')");
                stmt.executeUpdate("Insert into hasv2 values("+shopId+","+productId+")");
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Enter Correct Details");
            }
            color.setText("e.g. Black");
            modell.setText("e.g. 6 series");
            

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        ProductName.setText("");
        Price.setText("0");
    }//GEN-LAST:event_AddMouseClicked

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        Delete1.setVisible(true);
        Delete.setEnabled(false);
        Add.setVisible(false);
        Update22.setVisible(false);
        Show.setVisible(false);
        Search.setVisible(false);

        JProductName.setText("Product ID");
    }//GEN-LAST:event_DeleteActionPerformed

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void Update22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Update22MouseClicked

    private void Update22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update22ActionPerformed
        try{
            int id = 0;
            id = Integer.parseInt(ProductName.getText());
            Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            Statement stmt = mycon.createStatement();
            ProductTable.setFont(new Font("Serif", Font.BOLD, 15));
            DefaultTableModel model = (DefaultTableModel) ProductTable.getModel();
            model.setRowCount(0);
            ResultSet result = stmt.executeQuery("select product_id, product_name, product_price,product_category from product where product_id="+id+"");
            int count = 0;
            oldNaming = ProductName.getText();

            while (result.next()) {
                JOptionPane.showMessageDialog(null,"Record Found for "+id);
                ProductName.setText(result.getString(2));
                Price.setText(result.getString(3));
                jComboBox1.setSelectedItem(result.getString(4));
                update_category = result.getString(4);

                count++;
            }
            jComboBox1.setEnabled(false);

            if(update_category.equals("Accessories")){
                ResultSet accessoryResult = stmt.executeQuery("select accessory_model, accessory_color from accessories where product_id="+id+"");
                while (accessoryResult.next()) {
                    modell.setText(accessoryResult.getString(1));
                    color.setText(accessoryResult.getString(2));
                }
                
            }

            if(count==0){
                JOptionPane.showMessageDialog(null,"No Record Found for "+id);
            }
            else{
                JProductName.setText("New Name");
                JPrice.setText("New Salary");
                
                jcolor.setText("New Color");
                jmodel.setText("New Model");
                Update1.setVisible(true);
                Update22.setEnabled(false);

            }

        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_Update22ActionPerformed

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
        JOptionPane.showMessageDialog(null,"Enter Employee ID In Name Field To Update");
    }//GEN-LAST:event_tipsActionPerformed

    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        try{
            int count = 0;
            int id;
            try{
                id = Integer.parseInt(ProductName.getText());
                Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
                Statement stmt = mycon.createStatement();

                ResultSet result = stmt.executeQuery("select * from product where product_id = '"+id+"' ");
                int fetchedID=0;
                String product_category = "";
                while (result.next()) {
                    fetchedID = result.getInt(1);
                    product_category = result.getString(2);
                }
                stmt.executeUpdate("Delete from product where product_id = '"+id+"'");
                if(fetchedID==0){
                    JOptionPane.showMessageDialog(null,"No Record Found for: "+id);
                }
                else if(fetchedID!=0){
                    JOptionPane.showMessageDialog(null,"Record Deleted for: "+id);
                }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Not A Valid ID");
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        ProductName.setText("");
        Price.setText("0");

        Delete1.setVisible(false);
        Delete.setEnabled(true);

        Add.setVisible(true);
        Update22.setVisible(true);
        Show.setVisible(true);
        Search.setVisible(true);
        JProductName.setText("Product Name");

    }//GEN-LAST:event_Delete1ActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        try{
            String name = "";
            String user_name = "";
            String user_password = "";
            int salary = 0;

            name = ProductName.getText();
            salary = Integer.parseInt(Price.getText());

            Connection mycon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            Statement stmt = mycon.createStatement();
            int id = Integer.parseInt(oldNaming);

            
            modell.setEnabled(true);
            color.setEnabled(true);
            
            
            if(update_category.equals("Accessories")){
                stmt.executeUpdate("update accessories set accessory_model = '"+modell.getText()+"' where product_id="+oldNaming+"");
                stmt.executeUpdate("update accessories set accessory_color = '"+color.getText()+"' where product_id="+oldNaming+"");

            }
            stmt.executeUpdate("update product set product_name = '"+ProductName.getText()+"' where product_id="+oldNaming+"");
            stmt.executeUpdate("update product set product_price = '"+Price.getText()+"' where product_id="+oldNaming+"");
            jComboBox1.setEnabled(true);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        JProductName.setText("Product Name");
        JPrice.setText("Price");
        
        jcolor.setText("Color");
        jmodel.setText("Model");

        ProductName.setText("");
        
        color.setText("");
        modell.setText("");
        Price.setText("0");
        Update1.setVisible(false);
        Update22.setEnabled(true);
    }//GEN-LAST:event_Update1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        select_product = jComboBox1.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBoxShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxShopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxShopActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void showmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showmenuActionPerformed
        showmenu.setVisible(false);
        jPanel3.setVisible(true);
        HighestSalaryCounter.setVisible(false);
        employeeCounter.setVisible(false);
        LowestSalaryCounter.setVisible(false);
    }//GEN-LAST:event_showmenuActionPerformed

    private void ProductTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ProductTableInputMethodTextChanged

    }//GEN-LAST:event_ProductTableInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(managerAccessories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerAccessories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerAccessories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerAccessories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerAccessories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accessories;
    private javax.swing.JButton Add;
    private javax.swing.JButton Components;
    private javax.swing.JButton Computer;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Delete1;
    private javax.swing.JButton Employee;
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
    private javax.swing.JButton Products;
    private javax.swing.JButton Search;
    private javax.swing.JButton Show;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton Update1;
    private javax.swing.JButton Update22;
    private javax.swing.JTextField brand;
    private javax.swing.JButton brandManu;
    private javax.swing.JTextField color;
    private javax.swing.JPanel employeeCounter;
    private javax.swing.JLabel employeeNo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxShop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jbrand;
    private javax.swing.JLabel jcolor;
    private javax.swing.JLabel jmodel;
    private javax.swing.JLabel jquantity;
    private javax.swing.JLabel jyear;
    private javax.swing.JTextField modell;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton shop1;
    private javax.swing.JButton showmenu;
    private javax.swing.JButton tips;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
