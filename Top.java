/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdtimesacharm;

/**
 *
 * @author ima
 */
public class Top extends javax.swing.JFrame {

    /**
     * Creates new form Top
     */
    public Top() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TF_CritterCnt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TF_FoodCnt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_Year = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        SP_InitFoodCnt = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        SP_InitCritterCnt = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        SP_AgeOfRepro = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        SP_EnergyForRepro = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        SP_CostOfRepro = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SP_MaxEnergy = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        SP_FoodValue = new javax.swing.JSpinner();
        SP_MoveCost = new javax.swing.JSpinner();
        SP_FoodGrowthValue = new javax.swing.JSpinner();
        SP_MaxFood = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        CB_DeadAreFood = new javax.swing.JCheckBox();
        CB_ChildMutates = new javax.swing.JCheckBox();
        CB_ParentMutates = new javax.swing.JCheckBox();
        CB_OldAgeKills = new javax.swing.JCheckBox();
        SP_OldAgeKills = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabel12 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Btn_Start = new javax.swing.JButton();
        Btn_Pause = new javax.swing.JButton();
        Btn_Reset = new javax.swing.JButton();
        Btn_EXIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bugs");
        setMaximumSize(new java.awt.Dimension(900, 720));
        setMinimumSize(new java.awt.Dimension(900, 720));
        setPreferredSize(new java.awt.Dimension(900, 720));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(214, 214, 214)));
        jPanel1.setMaximumSize(new java.awt.Dimension(888, 688));
        jPanel1.setMinimumSize(new java.awt.Dimension(888, 688));
        jPanel1.setPreferredSize(new java.awt.Dimension(888, 688));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setMaximumSize(new java.awt.Dimension(880, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(880, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(880, 40));
        jPanel6.setLayout(new java.awt.GridLayout(1, 6));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Number of Critters:");
        jPanel6.add(jLabel1);

        TF_CritterCnt.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        TF_CritterCnt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TF_CritterCnt.setText("0");
        TF_CritterCnt.setToolTipText("");
        jPanel6.add(TF_CritterCnt);

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel2.setText("   Amount Of Food:");
        jPanel6.add(jLabel2);

        TF_FoodCnt.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        TF_FoodCnt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TF_FoodCnt.setText("0");
        jPanel6.add(TF_FoodCnt);

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel3.setText("   YEAR:");
        jPanel6.add(jLabel3);

        TF_Year.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        TF_Year.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TF_Year.setText("0");
        jPanel6.add(TF_Year);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel1.add(jPanel6, gridBagConstraints);

        jPanel5.setBackground(java.awt.Color.black);
        jPanel5.setMaximumSize(new java.awt.Dimension(880, 400));
        jPanel5.setMinimumSize(new java.awt.Dimension(880, 400));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jPanel5, gridBagConstraints);

        jPanel4.setBackground(java.awt.Color.red);
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setMaximumSize(new java.awt.Dimension(880, 240));
        jPanel4.setMinimumSize(new java.awt.Dimension(880, 240));
        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(293, 240));
        jPanel2.setMinimumSize(new java.awt.Dimension(293, 240));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        SP_InitFoodCnt.setModel(new javax.swing.SpinnerNumberModel(5000, 0, 60000, 1000));
        SP_InitFoodCnt.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_InitFoodCnt.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_InitFoodCnt.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel2.add(SP_InitFoodCnt, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Initial Food Count");
        jLabel18.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel18.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel18.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 13;
        jPanel2.add(jLabel18, gridBagConstraints);

        SP_InitCritterCnt.setModel(new javax.swing.SpinnerNumberModel(25, 1, 100, 1));
        SP_InitCritterCnt.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_InitCritterCnt.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_InitCritterCnt.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel2.add(SP_InitCritterCnt, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Initial Critter Count");
        jLabel19.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel19.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel19.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 13;
        jPanel2.add(jLabel19, gridBagConstraints);

        SP_AgeOfRepro.setModel(new javax.swing.SpinnerNumberModel(2500, 1, 50000, 250));
        SP_AgeOfRepro.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_AgeOfRepro.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_AgeOfRepro.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel2.add(SP_AgeOfRepro, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Age Of Reproduction");
        jLabel20.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel20.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel20.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 13;
        jPanel2.add(jLabel20, gridBagConstraints);

        SP_EnergyForRepro.setModel(new javax.swing.SpinnerNumberModel(2000, 500, 50000, 500));
        SP_EnergyForRepro.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_EnergyForRepro.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_EnergyForRepro.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel2.add(SP_EnergyForRepro, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Energy For Reproduction");
        jLabel21.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel21.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel21.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 13;
        jPanel2.add(jLabel21, gridBagConstraints);

        SP_CostOfRepro.setModel(new javax.swing.SpinnerNumberModel(500, 250, 50000, 250));
        SP_CostOfRepro.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_CostOfRepro.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_CostOfRepro.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel2.add(SP_CostOfRepro, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Cost Of Reporduction");
        jLabel22.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel22.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel22.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 13;
        jPanel2.add(jLabel22, gridBagConstraints);

        jPanel4.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMaximumSize(new java.awt.Dimension(293, 240));
        jPanel3.setMinimumSize(new java.awt.Dimension(293, 240));
        jPanel3.setPreferredSize(new java.awt.Dimension(293, 240));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Maximum Food");
        jLabel4.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel4.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel4.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Food Growth Rate");
        jLabel5.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel5.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel5.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Move Cost");
        jLabel6.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel6.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel6.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Food Value");
        jLabel7.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel7.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel7.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jLabel7, gridBagConstraints);

        SP_MaxEnergy.setModel(new javax.swing.SpinnerNumberModel(50000, 1000, 500000, 1000));
        SP_MaxEnergy.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_MaxEnergy.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_MaxEnergy.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(SP_MaxEnergy, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Maximum Critter Energy");
        jLabel8.setMaximumSize(new java.awt.Dimension(180, 28));
        jLabel8.setMinimumSize(new java.awt.Dimension(180, 28));
        jLabel8.setPreferredSize(new java.awt.Dimension(180, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(jLabel8, gridBagConstraints);

        SP_FoodValue.setModel(new javax.swing.SpinnerNumberModel(10, 0, 30, 1));
        SP_FoodValue.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_FoodValue.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_FoodValue.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(SP_FoodValue, gridBagConstraints);

        SP_MoveCost.setModel(new javax.swing.SpinnerNumberModel(2, 0, 50, 1));
        SP_MoveCost.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_MoveCost.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_MoveCost.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(SP_MoveCost, gridBagConstraints);

        SP_FoodGrowthValue.setModel(new javax.swing.SpinnerNumberModel(10, 0, 200, 10));
        SP_FoodGrowthValue.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_FoodGrowthValue.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_FoodGrowthValue.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(SP_FoodGrowthValue, gridBagConstraints);

        SP_MaxFood.setModel(new javax.swing.SpinnerNumberModel(10000, 0, 60000, 1000));
        SP_MaxFood.setMaximumSize(new java.awt.Dimension(100, 28));
        SP_MaxFood.setMinimumSize(new java.awt.Dimension(100, 28));
        SP_MaxFood.setPreferredSize(new java.awt.Dimension(100, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel3.add(SP_MaxFood, gridBagConstraints);

        jPanel4.add(jPanel3);

        jPanel7.setMaximumSize(new java.awt.Dimension(294, 240));
        jPanel7.setMinimumSize(new java.awt.Dimension(294, 240));
        jPanel7.setPreferredSize(new java.awt.Dimension(294, 240));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel8.setMaximumSize(new java.awt.Dimension(294, 120));
        jPanel8.setMinimumSize(new java.awt.Dimension(294, 120));
        jPanel8.setPreferredSize(new java.awt.Dimension(294, 120));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        CB_DeadAreFood.setText("Dead Are Food");
        CB_DeadAreFood.setMaximumSize(new java.awt.Dimension(125, 22));
        CB_DeadAreFood.setMinimumSize(new java.awt.Dimension(125, 22));
        CB_DeadAreFood.setPreferredSize(new java.awt.Dimension(125, 22));
        CB_DeadAreFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DeadAreFoodActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel8.add(CB_DeadAreFood, gridBagConstraints);

        CB_ChildMutates.setText("Child Mutates");
        CB_ChildMutates.setMaximumSize(new java.awt.Dimension(125, 22));
        CB_ChildMutates.setMinimumSize(new java.awt.Dimension(125, 22));
        CB_ChildMutates.setName(""); // NOI18N
        CB_ChildMutates.setPreferredSize(new java.awt.Dimension(125, 22));
        CB_ChildMutates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ChildMutatesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel8.add(CB_ChildMutates, gridBagConstraints);

        CB_ParentMutates.setText("Parent Mutates");
        CB_ParentMutates.setMaximumSize(new java.awt.Dimension(125, 22));
        CB_ParentMutates.setMinimumSize(new java.awt.Dimension(125, 22));
        CB_ParentMutates.setPreferredSize(new java.awt.Dimension(125, 22));
        CB_ParentMutates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ParentMutatesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel8.add(CB_ParentMutates, gridBagConstraints);

        CB_OldAgeKills.setText("Old Age Kills");
        CB_OldAgeKills.setMaximumSize(new java.awt.Dimension(125, 22));
        CB_OldAgeKills.setMinimumSize(new java.awt.Dimension(125, 22));
        CB_OldAgeKills.setPreferredSize(new java.awt.Dimension(125, 22));
        CB_OldAgeKills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_OldAgeKillsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel8.add(CB_OldAgeKills, gridBagConstraints);

        SP_OldAgeKills.setModel(new javax.swing.SpinnerNumberModel(1000, 100, 500000, 1000));
        SP_OldAgeKills.setMaximumSize(new java.awt.Dimension(47, 28));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel8.add(SP_OldAgeKills, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel7.add(jPanel8, gridBagConstraints);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setMaximumSize(new java.awt.Dimension(294, 70));
        jPanel9.setMinimumSize(new java.awt.Dimension(294, 70));
        jPanel9.setPreferredSize(new java.awt.Dimension(294, 70));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(10);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setValue(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 15);
        jPanel9.add(jSlider1, gridBagConstraints);

        jLabel12.setText("  Delay");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel9.add(jLabel12, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel7.add(jPanel9, gridBagConstraints);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setMaximumSize(new java.awt.Dimension(294, 50));
        jPanel10.setMinimumSize(new java.awt.Dimension(294, 50));
        jPanel10.setPreferredSize(new java.awt.Dimension(294, 50));
        jPanel10.setLayout(new java.awt.GridBagLayout());

        Btn_Start.setText(" Start ");
        Btn_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_StartActionPerformed(evt);
            }
        });
        jPanel10.add(Btn_Start, new java.awt.GridBagConstraints());

        Btn_Pause.setText(" Pause ");
        Btn_Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PauseActionPerformed(evt);
            }
        });
        jPanel10.add(Btn_Pause, new java.awt.GridBagConstraints());

        Btn_Reset.setText(" Reset ");
        Btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ResetActionPerformed(evt);
            }
        });
        jPanel10.add(Btn_Reset, new java.awt.GridBagConstraints());

        Btn_EXIT.setText(" EXIT ");
        Btn_EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EXITActionPerformed(evt);
            }
        });
        jPanel10.add(Btn_EXIT, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        jPanel7.add(jPanel10, gridBagConstraints);

        jPanel4.add(jPanel7);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jPanel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_OldAgeKillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_OldAgeKillsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_OldAgeKillsActionPerformed

    private void CB_ParentMutatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ParentMutatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_ParentMutatesActionPerformed

    private void CB_DeadAreFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DeadAreFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_DeadAreFoodActionPerformed

    private void CB_ChildMutatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ChildMutatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_ChildMutatesActionPerformed

    private void Btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_StartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_StartActionPerformed

    private void Btn_PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_PauseActionPerformed

    private void Btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_ResetActionPerformed

    private void Btn_EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Btn_EXITActionPerformed

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
            java.util.logging.Logger.getLogger(Top.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Top.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Top.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Top.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Top().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_EXIT;
    private javax.swing.JButton Btn_Pause;
    private javax.swing.JButton Btn_Reset;
    private javax.swing.JButton Btn_Start;
    private javax.swing.JCheckBox CB_ChildMutates;
    private javax.swing.JCheckBox CB_DeadAreFood;
    private javax.swing.JCheckBox CB_OldAgeKills;
    private javax.swing.JCheckBox CB_ParentMutates;
    private javax.swing.JSpinner SP_AgeOfRepro;
    private javax.swing.JSpinner SP_CostOfRepro;
    private javax.swing.JSpinner SP_EnergyForRepro;
    private javax.swing.JSpinner SP_FoodGrowthValue;
    private javax.swing.JSpinner SP_FoodValue;
    private javax.swing.JSpinner SP_InitCritterCnt;
    private javax.swing.JSpinner SP_InitFoodCnt;
    private javax.swing.JSpinner SP_MaxEnergy;
    private javax.swing.JSpinner SP_MaxFood;
    private javax.swing.JSpinner SP_MoveCost;
    private javax.swing.JSpinner SP_OldAgeKills;
    private javax.swing.JTextField TF_CritterCnt;
    private javax.swing.JTextField TF_FoodCnt;
    private javax.swing.JTextField TF_Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}