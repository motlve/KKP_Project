/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.kkp.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author user
 */
public class Panel extends javax.swing.JPanel {

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    protected void paintComponent(Graphics g) {
         Graphics2D g2 = (Graphics2D) g;
    GradientPaint gradientPaint = new GradientPaint(0, 0, Color.decode("#CB356B"), 0, getHeight(), Color.decode("#BD3F32"));
    g2.setPaint(gradientPaint);
    g2.fillRect(0, 0, getWidth() - 15, getHeight()); // Menggambar bagian kiri
    g2.fillRoundRect(getWidth() - 20, 0, 20, getHeight(), 15, 15); // Menggambar bagian kanan sebagai round rectangle
    super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
