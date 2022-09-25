/* DON-CODE */
package Main;

import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.io.OutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.text.DefaultCaret;

public class MainReceive extends javax.swing.JFrame {

    SerialPort serialPort1;
    OutputStream outputStream1;
    String dataBuffer = "";

    public MainReceive() {
        initComponents();
        mainThing();
    }

    private void mainThing() {
        ImageIcon img = new ImageIcon(MainReceive.class.getClassLoader().getResource("pic/icons8_radar_30px.png"));
        this.setIconImage(img.getImage()); // Add program icon
        setLocationRelativeTo(null); // Set location to Center
        /* Set button values */
        jComboBox_baudRate.setSelectedIndex(1);
        jComboBox_dataBits.setSelectedIndex(2);
        jComboBox_stopBits.setSelectedIndex(0);
        jComboBox_parityBits.setSelectedIndex(0);
        jComboBox_comPort.setEnabled(true);
        jProgressBar_comStatus.setValue(0);
        jButton_open.setEnabled(true);
        jButton_close.setEnabled(false);
        jButton_send.setEnabled(false);
        jRadioButtonMenuItem_both.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_comPort = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_baudRate = new javax.swing.JComboBox<>();
        jComboBox_dataBits = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_stopBits = new javax.swing.JComboBox<>();
        jProgressBar_comStatus = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_parityBits = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jButton_send = new javax.swing.JButton();
        jTextField_dataToSend = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_incomingData = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton_open = new javax.swing.JButton();
        jButton_close = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jRadioButtonMenuItem_none = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem_newLine = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem_carriageReturn = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem_both = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_clearData = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        alwaysOnTopCheckBox = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JSerial Communication");
        setIconImages(null);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COM port settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setText("COM port");

        jComboBox_comPort.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_comPortPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox_comPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_comPortActionPerformed(evt);
            }
        });

        jLabel2.setText("BAUD rate");

        jComboBox_baudRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4800", "9600", "38400", "57600", "115200" }));

        jComboBox_dataBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6", "7", "8" }));

        jLabel3.setText("Data bits");

        jLabel4.setText("Stop bits");

        jComboBox_stopBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "1.5", "2" }));

        jLabel6.setText("COM status");

        jLabel7.setText("Parity bits");

        jComboBox_parityBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO_PARITY", "EVEN_PARITY", "ODD_PARITY", "MARK_PARITY", "SPACE_PARITY" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_stopBits, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_dataBits, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_parityBits, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox_baudRate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox_comPort, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_comPort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_baudRate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_dataBits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_stopBits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_parityBits))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar_comStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jButton_send.setBackground(new java.awt.Color(0, 153, 0));
        jButton_send.setText("Send");
        jButton_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sendActionPerformed(evt);
            }
        });

        jTextArea_incomingData.setColumns(20);
        jTextArea_incomingData.setRows(5);
        jTextArea_incomingData.setAutoscrolls(true);
        jTextArea_incomingData.setBorder(javax.swing.BorderFactory.createTitledBorder("Receive data"));
        jTextArea_incomingData.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextArea_incomingDataCaretUpdate(evt);
            }
        });
        jTextArea_incomingData.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTextArea_incomingDataCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextArea_incomingData);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextField_dataToSend, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_send, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_send, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_dataToSend, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton_open.setBackground(new java.awt.Color(0, 153, 0));
        jButton_open.setText("Open");
        jButton_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_openActionPerformed(evt);
            }
        });

        jButton_close.setBackground(new java.awt.Color(204, 0, 51));
        jButton_close.setText("Close");
        jButton_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jButton_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu2.setText("Tx Menu");

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_Binary_Code_20px.png"))); // NOI18N
        jMenu4.setText("End Line");

        buttonGroup1.add(jRadioButtonMenuItem_none);
        jRadioButtonMenuItem_none.setSelected(true);
        jRadioButtonMenuItem_none.setText("None");
        jRadioButtonMenuItem_none.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem_noneActionPerformed(evt);
            }
        });
        jMenu4.add(jRadioButtonMenuItem_none);

        buttonGroup1.add(jRadioButtonMenuItem_newLine);
        jRadioButtonMenuItem_newLine.setText("New Line (\\n)");
        jRadioButtonMenuItem_newLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem_newLineActionPerformed(evt);
            }
        });
        jMenu4.add(jRadioButtonMenuItem_newLine);

        buttonGroup1.add(jRadioButtonMenuItem_carriageReturn);
        jRadioButtonMenuItem_carriageReturn.setText("Carriage Return (\\r)");
        jMenu4.add(jRadioButtonMenuItem_carriageReturn);

        buttonGroup1.add(jRadioButtonMenuItem_both);
        jRadioButtonMenuItem_both.setText("Both (\\r\\n)");
        jMenu4.add(jRadioButtonMenuItem_both);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Rx Menu");

        jMenuItem_clearData.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem_clearData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_broom_20px.png"))); // NOI18N
        jMenuItem_clearData.setText("Clear Data");
        jMenuItem_clearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_clearDataActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_clearData);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Settings");

        alwaysOnTopCheckBox.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        alwaysOnTopCheckBox.setText("Always on top");
        alwaysOnTopCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alwaysOnTopCheckBoxActionPerformed(evt);
            }
        });
        jMenu1.add(alwaysOnTopCheckBox);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_comPortPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_comPortPopupMenuWillBecomeVisible
        jComboBox_comPort.removeAllItems();
        SerialPort[] portList = SerialPort.getCommPorts();
        for (SerialPort port : portList) {
            jComboBox_comPort.addItem(port.getSystemPortName());
        }
    }//GEN-LAST:event_jComboBox_comPortPopupMenuWillBecomeVisible

    private void jComboBox_comPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_comPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_comPortActionPerformed

    private void jButton_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_openActionPerformed
        try {
            SerialPort[] portLists = SerialPort.getCommPorts();
            serialPort1 = portLists[jComboBox_comPort.getSelectedIndex()];
            serialPort1.setBaudRate(Integer.parseInt(jComboBox_baudRate.getSelectedItem().toString()));
            serialPort1.setNumDataBits(Integer.parseInt(jComboBox_dataBits.getSelectedItem().toString()));
            serialPort1.setNumDataBits(Integer.parseInt(jComboBox_stopBits.getSelectedItem().toString()));
            serialPort1.setParity(jComboBox_parityBits.getSelectedIndex());
            serialPort1.openPort();
            if (serialPort1.isOpen()) {
                JOptionPane.showMessageDialog(this, serialPort1.getDescriptivePortName() + " -- Success to OPEN ..!");
                jComboBox_comPort.setEnabled(false);
                jProgressBar_comStatus.setValue(100);
                jButton_open.setEnabled(false);
                jButton_close.setEnabled(true);
                jButton_send.setEnabled(true);
                Serial_EventBasedReading(serialPort1);
            } else {
                JOptionPane.showMessageDialog(this, serialPort1.getDescriptivePortName() + " -- Failed to OPEN ..!");
            }

        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(this, "PLease Choose COM Port ..!", "ERROR", ERROR_MESSAGE);
        } catch (Exception b) {
            JOptionPane.showMessageDialog(this, b, "ERROR", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_openActionPerformed

    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_closeActionPerformed
        try {
            if (serialPort1.isOpen()) {
                serialPort1.closePort();
                jComboBox_comPort.setEnabled(true);
                jProgressBar_comStatus.setValue(0);
                jButton_open.setEnabled(true);
                jButton_close.setEnabled(false);
                jButton_send.setEnabled(false);

                try {
                    outputStream1.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Port Close Successfully...!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "ERROR", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_closeActionPerformed

    private void jButton_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sendActionPerformed
        outputStream1 = serialPort1.getOutputStream();
        String dataToSend = "";
        if (jRadioButtonMenuItem_none.isSelected()) {
            dataToSend = jTextField_dataToSend.getText();
        } else if (jRadioButtonMenuItem_newLine.isSelected()) {
            dataToSend = jTextField_dataToSend.getText() + "\n";
        } else if (jRadioButtonMenuItem_carriageReturn.isSelected()) {
            dataToSend = jTextField_dataToSend.getText() + "\r";
        } else if (jRadioButtonMenuItem_both.isSelected()) {
            dataToSend = jTextField_dataToSend.getText() + "\r\n";
        }
        try {
            outputStream1.write(dataToSend.getBytes());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_jButton_sendActionPerformed

    private void jRadioButtonMenuItem_noneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem_noneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem_noneActionPerformed

    private void jRadioButtonMenuItem_newLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem_newLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem_newLineActionPerformed

    private void jMenuItem_clearDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_clearDataActionPerformed
        dataBuffer = "";
        jTextArea_incomingData.setText(dataBuffer);
        jTextField_dataToSend.setText("");
    }//GEN-LAST:event_jMenuItem_clearDataActionPerformed

    private void alwaysOnTopCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alwaysOnTopCheckBoxActionPerformed
        if (alwaysOnTopCheckBox.isSelected()) {
            this.setAlwaysOnTop(true);
        } else if (!alwaysOnTopCheckBox.isSelected()) {
            this.setAlwaysOnTop(false);
        } else {
        }
    }//GEN-LAST:event_alwaysOnTopCheckBoxActionPerformed

    private void jTextArea_incomingDataCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextArea_incomingDataCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea_incomingDataCaretPositionChanged
    private void jTextArea_incomingDataCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextArea_incomingDataCaretUpdate

    }//GEN-LAST:event_jTextArea_incomingDataCaretUpdate

    private void Serial_EventBasedReading(SerialPort activePort) {
        activePort.addDataListener(new SerialPortDataListener() {
            @Override
            public int getListeningEvents() {
                return serialPort1.LISTENING_EVENT_DATA_RECEIVED;
            }

            @Override
            public void serialEvent(SerialPortEvent event) {
                byte[] newData = event.getReceivedData();
                for (int i = 0; i < newData.length; i++) {
                    dataBuffer += (char) newData[i];
                    jTextArea_incomingData.setText(dataBuffer);
                    jTextArea_incomingData.setCaretPosition(jTextArea_incomingData.getDocument().getLength());
                }
            }
        });
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainReceive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainReceive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainReceive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainReceive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainReceive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem alwaysOnTopCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_close;
    private javax.swing.JButton jButton_open;
    private javax.swing.JButton jButton_send;
    private javax.swing.JComboBox<String> jComboBox_baudRate;
    private javax.swing.JComboBox<String> jComboBox_comPort;
    private javax.swing.JComboBox<String> jComboBox_dataBits;
    private javax.swing.JComboBox<String> jComboBox_parityBits;
    private javax.swing.JComboBox<String> jComboBox_stopBits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_clearData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar_comStatus;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem_both;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem_carriageReturn;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem_newLine;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem_none;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_incomingData;
    private javax.swing.JTextField jTextField_dataToSend;
    // End of variables declaration//GEN-END:variables
}
