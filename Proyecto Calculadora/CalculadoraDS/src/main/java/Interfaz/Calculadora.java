package Interfaz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public final class Calculadora extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private String operacion = "Error";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;
    private boolean sonidoHabilitado = true;

    public Clip clip;
    public String ruta = "/Sonidos/";

    public Calculadora() {

        initComponents();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);

    }

    //Icono del JFrame
    @Override
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/IconoCalculadora.png"));
        return retValue;

    }

    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpl_FondoBotones = new javax.swing.JPanel();
        btn_Punto = new javax.swing.JButton();
        btn_Siete = new javax.swing.JButton();
        btn_Ocho = new javax.swing.JButton();
        btn_Nueve = new javax.swing.JButton();
        btn_Cuatro = new javax.swing.JButton();
        btn_Cinco = new javax.swing.JButton();
        btn_Seis = new javax.swing.JButton();
        btn_Uno = new javax.swing.JButton();
        btn_Dos = new javax.swing.JButton();
        btn_Tres = new javax.swing.JButton();
        btn_Cero = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        btn_Borrar = new javax.swing.JButton();
        btn_Igual = new javax.swing.JButton();
        btn_Multiplicar = new javax.swing.JButton();
        btn_Suma = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();
        btn_Restar = new javax.swing.JButton();
        btn_DIvision = new javax.swing.JButton();
        jpl_Pantalla = new javax.swing.JPanel();
        txt_Operacion = new javax.swing.JLabel();
        txt_Resultado = new javax.swing.JLabel();
        btn_SinSonido = new javax.swing.JButton();
        btn_CambiodeTema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpl_FondoBotones.setBackground(new java.awt.Color(230, 230, 230));
        jpl_FondoBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Punto.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Punto.setForeground(new java.awt.Color(0, 0, 0));
        btn_Punto.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png"))))); // NOI18N
        btn_Punto.setText(".");
        btn_Punto.setBorder(null);
        btn_Punto.setFocusable(false);
        btn_Punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Punto.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Punto.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Punto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PuntoMouseClicked();
            }
        });
        btn_Punto.addActionListener(this::btn_PuntoActionPerformed);
        jpl_FondoBotones.add(btn_Punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 50, 50));

        btn_Siete.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Siete.setForeground(new java.awt.Color(0, 0, 0));
        btn_Siete.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Siete.setText("7");
        btn_Siete.setBorder(null);
        btn_Siete.setFocusable(false);
        btn_Siete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Siete.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Siete.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SieteMouseClicked();
            }
        });
        btn_Siete.addActionListener(this::btn_SieteActionPerformed);
        jpl_FondoBotones.add(btn_Siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 50));

        btn_Ocho.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Ocho.setForeground(new java.awt.Color(0, 0, 0));
        btn_Ocho.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Ocho.setText("8");
        btn_Ocho.setBorder(null);
        btn_Ocho.setFocusable(false);
        btn_Ocho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Ocho.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Ocho.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_OchoMouseClicked();
            }
        });
        btn_Ocho.addActionListener(this::btn_OchoActionPerformed);
        jpl_FondoBotones.add(btn_Ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 50, 50));

        btn_Nueve.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Nueve.setForeground(new java.awt.Color(0, 0, 0));
        btn_Nueve.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Nueve.setText("9");
        btn_Nueve.setBorder(null);
        btn_Nueve.setFocusable(false);
        btn_Nueve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Nueve.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Nueve.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Nueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NueveMouseClicked();
            }
        });
        btn_Nueve.addActionListener(evt -> btn_NueveActionPerformed());
        jpl_FondoBotones.add(btn_Nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 50, 50));

        btn_Cuatro.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Cuatro.setForeground(new java.awt.Color(0, 0, 0));
        btn_Cuatro.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Cuatro.setText("4");
        btn_Cuatro.setBorder(null);
        btn_Cuatro.setFocusable(false);
        btn_Cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cuatro.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Cuatro.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CuatroMouseClicked();
            }
        });
        btn_Cuatro.addActionListener(this::btn_CuatroActionPerformed);
        jpl_FondoBotones.add(btn_Cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 50));

        btn_Cinco.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Cinco.setForeground(new java.awt.Color(0, 0, 0));
        btn_Cinco.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Cinco.setText("5");
        btn_Cinco.setBorder(null);
        btn_Cinco.setFocusable(false);
        btn_Cinco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cinco.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Cinco.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CincoMouseClicked();
            }
        });
        btn_Cinco.addActionListener(this::btn_CincoActionPerformed);
        jpl_FondoBotones.add(btn_Cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 50, 50));

        btn_Seis.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Seis.setForeground(new java.awt.Color(0, 0, 0));
        btn_Seis.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Seis.setText("6");
        btn_Seis.setBorder(null);
        btn_Seis.setFocusable(false);
        btn_Seis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Seis.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Seis.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SeisMouseClicked();
            }
        });
        btn_Seis.addActionListener(this::btn_SeisActionPerformed);
        jpl_FondoBotones.add(btn_Seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 50, 50));

        btn_Uno.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Uno.setForeground(new java.awt.Color(0, 0, 0));
        btn_Uno.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Uno.setText("1");
        btn_Uno.setBorder(null);
        btn_Uno.setFocusable(false);
        btn_Uno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Uno.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Uno.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UnoMouseClicked();
            }
        });
        btn_Uno.addActionListener(this::btn_UnoActionPerformed);
        jpl_FondoBotones.add(btn_Uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, 50));

        btn_Dos.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Dos.setForeground(new java.awt.Color(0, 0, 0));
        btn_Dos.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Dos.setText("2");
        btn_Dos.setBorder(null);
        btn_Dos.setFocusable(false);
        btn_Dos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Dos.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Dos.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DosMouseClicked();
            }
        });
        btn_Dos.addActionListener(evt -> btn_DosActionPerformed());
        jpl_FondoBotones.add(btn_Dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 50, 50));

        btn_Tres.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Tres.setForeground(new java.awt.Color(0, 0, 0));
        btn_Tres.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Tres.setText("3");
        btn_Tres.setBorder(null);
        btn_Tres.setFocusable(false);
        btn_Tres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Tres.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton.png")))); // NOI18N
        btn_Tres.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-presionar.png")))); // NOI18N
        btn_Tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TresMouseClicked();
            }
        });
        btn_Tres.addActionListener(evt -> btn_TresActionPerformed());
        jpl_FondoBotones.add(btn_Tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 50, 50));

        btn_Cero.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 30)); // NOI18N
        btn_Cero.setForeground(new java.awt.Color(0, 0, 0));
        btn_Cero.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-Cero.png")))); // NOI18N
        btn_Cero.setText("0");
        btn_Cero.setBorder(null);
        btn_Cero.setFocusable(false);
        btn_Cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cero.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-Cero.png")))); // NOI18N
        btn_Cero.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-Cero-Presionar.png")))); // NOI18N
        btn_Cero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CeroMouseClicked();
            }
        });
        btn_Cero.addActionListener(this::btn_CeroActionPerformed);
        jpl_FondoBotones.add(btn_Cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("__");
        jpl_FondoBotones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("__");
        jpl_FondoBotones.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, 50));

        btn_Borrar.setFont(new java.awt.Font("SansSerif", Font.BOLD, 14)); // NOI18N
        btn_Borrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Borrar.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-delete.png")))); // NOI18N
        btn_Borrar.setBorder(null);
        btn_Borrar.setFocusPainted(false);
        btn_Borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Borrar.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-delete.png")))); // NOI18N
        btn_Borrar.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-delete-presionar.png")))); // NOI18N
        btn_Borrar.addActionListener(evt -> btn_BorrarActionPerformed());
        jpl_FondoBotones.add(btn_Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 50, 50));

        btn_Igual.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 40)); // NOI18N
        btn_Igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_Igual.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-igual.png")))); // NOI18N
        btn_Igual.setText("=");
        btn_Igual.setBorder(null);
        btn_Igual.setFocusPainted(false);
        btn_Igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Igual.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-operaciones.png")))); // NOI18N
        btn_Igual.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-operacion-presionar.png")))); // NOI18N
        btn_Igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_IgualMouseClicked();
            }
        });
        btn_Igual.addActionListener(evt -> btn_IgualActionPerformed());
        jpl_FondoBotones.add(btn_Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 50, 50));

        btn_Multiplicar.setFont(new java.awt.Font("SansSerif", Font.BOLD, 30)); // NOI18N
        btn_Multiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Multiplicar.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-operaciones.png")))); // NOI18N
        btn_Multiplicar.setText("X");
        btn_Multiplicar.setBorder(null);
        btn_Multiplicar.setFocusPainted(false);
        btn_Multiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Multiplicar.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-operaciones.png")))); // NOI18N
        btn_Multiplicar.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-operacion-presionar.png")))); // NOI18N
        btn_Multiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MultiplicarMouseClicked();
            }
        });
        btn_Multiplicar.addActionListener(evt -> btn_MultiplicarActionPerformed());
        jpl_FondoBotones.add(btn_Multiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 50, 50));

        btn_Suma.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 50)); // NOI18N
        btn_Suma.setForeground(new java.awt.Color(255, 255, 255));
        btn_Suma.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-operaciones.png")))); // NOI18N
        btn_Suma.setText("+");
        btn_Suma.setBorder(null);
        btn_Suma.setFocusPainted(false);
        btn_Suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Suma.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-operaciones.png")))); // NOI18N
        btn_Suma.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-operacion-presionar.png")))); // NOI18N
        btn_Suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SumaMouseClicked();
            }
        });
        btn_Suma.addActionListener(evt -> btn_SumaActionPerformed());
        jpl_FondoBotones.add(btn_Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 50, 50));

        btn_Cancelar.setFont(new java.awt.Font("SansSerif", Font.BOLD, 30)); // NOI18N
        btn_Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Cancelar.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-C.png")))); // NOI18N
        btn_Cancelar.setBorder(null);
        btn_Cancelar.setFocusPainted(false);
        btn_Cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_Cancelar.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-C.png")))); // NOI18N
        btn_Cancelar.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-C-Presionar.png")))); // NOI18N
        btn_Cancelar.addActionListener(evt -> btn_CancelarActionPerformed());
        jpl_FondoBotones.add(btn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 50));

        btn_Restar.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-Resta.png")))); // NOI18N
        btn_Restar.setBorder(null);
        btn_Restar.setFocusPainted(false);
        btn_Restar.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-Resta.png")))); // NOI18N
        btn_Restar.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-Resta-Presionar.png")))); // NOI18N
        btn_Restar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RestarMouseClicked();
            }
        });
        btn_Restar.addActionListener(evt -> btn_RestarActionPerformed());
        jpl_FondoBotones.add(btn_Restar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 50, 50));

        btn_DIvision.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-division.png")))); // NOI18N
        btn_DIvision.setBorder(null);
        btn_DIvision.setFocusable(false);
        btn_DIvision.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-division.png")))); // NOI18N
        btn_DIvision.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Boton-division-presionar.png")))); // NOI18N
        btn_DIvision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_DIvisionMouseClicked();
            }
        });
        btn_DIvision.addActionListener(evt -> btn_DIvisionActionPerformed());
        jpl_FondoBotones.add(btn_DIvision, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 50, 50));

        getContentPane().add(jpl_FondoBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 300, 340));

        jpl_Pantalla.setBackground(new java.awt.Color(240, 240, 240));
        jpl_Pantalla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Operacion.setFont(new java.awt.Font("SansSerif", Font.BOLD, 24)); // NOI18N
        txt_Operacion.setForeground(new java.awt.Color(0, 0, 0));
        txt_Operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jpl_Pantalla.add(txt_Operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 50));

        txt_Resultado.setFont(new java.awt.Font("SansSerif", Font.BOLD, 50)); // NOI18N
        txt_Resultado.setForeground(new java.awt.Color(0, 0, 0));
        txt_Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jpl_Pantalla.add(txt_Resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 280, 50));

        btn_SinSonido.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Sonido.png")))); // NOI18N
        btn_SinSonido.setBorder(null);
        btn_SinSonido.setFocusPainted(false);
        btn_SinSonido.setPressedIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Sonido.png")))); // NOI18N
        btn_SinSonido.setRolloverIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Sonido-presionar.png")))); // NOI18N
        btn_SinSonido.addActionListener(evt -> btn_SinSonidoActionPerformed());
        jpl_Pantalla.add(btn_SinSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        btn_CambiodeTema.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Botton-OFF.png")))); // NOI18N
        btn_CambiodeTema.setBorder(null);
        btn_CambiodeTema.setFocusable(false);
        btn_CambiodeTema.addActionListener(evt -> btn_CambiodeTemaActionPerformed());
        jpl_Pantalla.add(btn_CambiodeTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, 30));

        getContentPane().add(jpl_Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CeroActionPerformed(ActionEvent actionEvent) {

        sonido("Cero");

        agregarNumero("0");

    }

    public void sonido(String archivo) {

        if (sonidoHabilitado) {
            try {
                clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(Objects.requireNonNull(getClass().getResourceAsStream(ruta + archivo + ".wav"))));
                clip.start();
            } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                // manejo de excepciones
            }
        }

    }

    private void agregarNumero(String numero) {

        if (activado) {
            txt_Resultado.setText("");
            activado = false;
        }
        cadenaNumeros += numero;
        txt_Resultado.setText(txt_Resultado.getText() + numero);

    }

    private void realizarOperacion(String nuevaOperacion) {

        if (cadenaNumeros.length() > 0) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            operacion = nuevaOperacion;
            cadenaNumeros = "";
            txt_Operacion.setText(txt_Resultado.getText() + " " + operacion);
            activado = true;
            punto = true;
        }

    }

    private void btn_CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CincoActionPerformed

        sonido("Cinco");

        agregarNumero("5");

    }//GEN-LAST:event_btn_CincoActionPerformed

    private void btn_TresActionPerformed() {//GEN-FIRST:event_btn_TresActionPerformed

        sonido("Tres");

        agregarNumero("3");

    }//GEN-LAST:event_btn_TresActionPerformed

    private void btn_CuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CuatroActionPerformed

        sonido("Cuatro");

        agregarNumero("4");

    }//GEN-LAST:event_btn_CuatroActionPerformed

    private void btn_MultiplicarActionPerformed() {//GEN-FIRST:event_btn_MultiplicarActionPerformed

        sonido("Por");

        realizarOperacion("x");

    }//GEN-LAST:event_btn_MultiplicarActionPerformed

    private void btn_IgualActionPerformed() {//GEN-FIRST:event_btn_IgualActionPerformed

        sonido("Igual-a");

        if (!cadenaNumeros.equals("")) {
            double segundoNumero = Double.parseDouble(cadenaNumeros);
            switch (operacion) {
                case "+" ->
                    resultado = primerNumero + segundoNumero;
                case "-" ->
                    resultado = primerNumero - segundoNumero;
                case "x" ->
                    resultado = primerNumero * segundoNumero;
                case "/" ->
                    resultado = primerNumero / segundoNumero;
                default ->
                    operacion = "Error";
            }
            txt_Resultado.setText(Double.toString(resultado));
            txt_Operacion.setText(txt_Operacion.getText() + " " + cadenaNumeros + " = " + resultado);
            cadenaNumeros = "";
        }

    }//GEN-LAST:event_btn_IgualActionPerformed

    private void btn_CancelarActionPerformed() {//GEN-FIRST:event_btn_CancelarActionPerformed

        cadenaNumeros = "";
        operacion = "Error";
        primerNumero = 0;
        resultado = 0;
        activado = true;
        punto = true;
        txt_Resultado.setText("");
        txt_Operacion.setText("");

    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_SieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SieteActionPerformed

        sonido("Siete");

        agregarNumero("7");

    }//GEN-LAST:event_btn_SieteActionPerformed

    private void btn_OchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OchoActionPerformed

        sonido("Ocho");

        agregarNumero("8");

    }//GEN-LAST:event_btn_OchoActionPerformed

    private void btn_NueveActionPerformed() {//GEN-FIRST:event_btn_NueveActionPerformed

        sonido("Nueve");

        agregarNumero("9");

    }//GEN-LAST:event_btn_NueveActionPerformed

    private void btn_SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeisActionPerformed

        sonido("Seis");

        agregarNumero("6");

    }//GEN-LAST:event_btn_SeisActionPerformed

    private void btn_UnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UnoActionPerformed

        sonido("Uno");

        agregarNumero("1");

    }//GEN-LAST:event_btn_UnoActionPerformed

    private void btn_DosActionPerformed() {//GEN-FIRST:event_btn_DosActionPerformed

        sonido("Dos");

        agregarNumero("2");

    }//GEN-LAST:event_btn_DosActionPerformed

    private void btn_DIvisionActionPerformed() {//GEN-FIRST:event_btn_DIvisionActionPerformed

        sonido("Entre");

        realizarOperacion("/");

    }//GEN-LAST:event_btn_DIvisionActionPerformed

    private void btn_RestarActionPerformed() {//GEN-FIRST:event_btn_RestarActionPerformed

        sonido("Menos");

        realizarOperacion("-");

    }//GEN-LAST:event_btn_RestarActionPerformed

    private void btn_SumaActionPerformed() {//GEN-FIRST:event_btn_SumaActionPerformed

        sonido("Más");

        realizarOperacion("+");

    }//GEN-LAST:event_btn_SumaActionPerformed

    private void btn_PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PuntoActionPerformed

        sonido("Punto");

        if (punto && !cadenaNumeros.equals("")) {
            cadenaNumeros += ".";
            punto = false;
            txt_Resultado.setText(txt_Resultado.getText() + ".");
        }

    }//GEN-LAST:event_btn_PuntoActionPerformed

    private void btn_BorrarActionPerformed() {//GEN-FIRST:event_btn_BorrarActionPerformed

        if (!cadenaNumeros.equals("")) {
            cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1);
            txt_Resultado.setText(txt_Resultado.getText().substring(0, txt_Resultado.getText().length() - 1));
            punto = !cadenaNumeros.contains(".");
        }

    }//GEN-LAST:event_btn_BorrarActionPerformed
    
    boolean modoDS = false;

    private void btn_CambiodeTemaActionPerformed() {//GEN-FIRST:event_btn_CambiodeTemaActionPerformed

        btn_CambiodeTema.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-ON.png"))));

        if (!modoDS) {

            jpl_Pantalla.setBackground(Color.decode("#F0F0F0"));
            jpl_FondoBotones.setBackground(Color.decode("#E6E6E6"));

            CambiarColorBtn(btn_Uno);
            CambiarColorBtn(btn_Dos);
            CambiarColorBtn(btn_Tres);
            CambiarColorBtn(btn_Cuatro);
            CambiarColorBtn(btn_Cinco);
            CambiarColorBtn(btn_Seis);
            CambiarColorBtn(btn_Siete);
            CambiarColorBtn(btn_Ocho);
            CambiarColorBtn(btn_Nueve);
            CambiarColorBtn(btn_Punto);

            CambiarColorBtn2(btn_Igual);
            CambiarColorBtn2(btn_Multiplicar);
            CambiarColorBtn2(btn_Suma);

            CambiarIconoDividir(btn_DIvision);

            CambiarIconoRestar(btn_Restar);

            CambiarIconoCancelar(btn_Cancelar);

            CambiarIconoDelete(btn_Borrar);

            CambiarIconoCero(btn_Cero);

            modoDS = true;
        } else {
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        }

    }//GEN-LAST:event_btn_CambiodeTemaActionPerformed

    private void btn_DIvisionMouseClicked() {//GEN-FIRST:event_btn_DIvisionMouseClicked
        sonido("Entre");
    }//GEN-LAST:event_btn_DIvisionMouseClicked

    private void btn_MultiplicarMouseClicked() {//GEN-FIRST:event_btn_MultiplicarMouseClicked
        sonido("Por");
    }//GEN-LAST:event_btn_MultiplicarMouseClicked

    private void btn_RestarMouseClicked() {//GEN-FIRST:event_btn_RestarMouseClicked
        sonido("Menos");
    }//GEN-LAST:event_btn_RestarMouseClicked

    private void btn_SumaMouseClicked() {//GEN-FIRST:event_btn_SumaMouseClicked
        sonido("Más");
    }//GEN-LAST:event_btn_SumaMouseClicked

    private void btn_IgualMouseClicked() {//GEN-FIRST:event_btn_IgualMouseClicked
        sonido("Igual-a");
    }//GEN-LAST:event_btn_IgualMouseClicked

    private void btn_PuntoMouseClicked() {//GEN-FIRST:event_btn_PuntoMouseClicked
        sonido("Punto");
    }//GEN-LAST:event_btn_PuntoMouseClicked

    private void btn_CeroMouseClicked() {//GEN-FIRST:event_btn_CeroMouseClicked
        sonido("Cero");
    }//GEN-LAST:event_btn_CeroMouseClicked

    private void btn_UnoMouseClicked() {//GEN-FIRST:event_btn_UnoMouseClicked
        sonido("Uno");
    }//GEN-LAST:event_btn_UnoMouseClicked

    private void btn_DosMouseClicked() {//GEN-FIRST:event_btn_DosMouseClicked
        sonido("Dos");
    }//GEN-LAST:event_btn_DosMouseClicked

    private void btn_TresMouseClicked() {//GEN-FIRST:event_btn_TresMouseClicked
        sonido("Tres");
    }//GEN-LAST:event_btn_TresMouseClicked

    private void btn_CuatroMouseClicked() {//GEN-FIRST:event_btn_CuatroMouseClicked
        sonido("Cuatro");
    }//GEN-LAST:event_btn_CuatroMouseClicked

    private void btn_CincoMouseClicked() {//GEN-FIRST:event_btn_CincoMouseClicked
        sonido("Cinco");
    }//GEN-LAST:event_btn_CincoMouseClicked

    private void btn_SeisMouseClicked() {//GEN-FIRST:event_btn_SeisMouseClicked
        sonido("Seis");
    }//GEN-LAST:event_btn_SeisMouseClicked

    private void btn_SieteMouseClicked() {//GEN-FIRST:event_btn_SieteMouseClicked
        sonido("Siete");
    }//GEN-LAST:event_btn_SieteMouseClicked

    private void btn_OchoMouseClicked() {//GEN-FIRST:event_btn_OchoMouseClicked
        sonido("Ocho");
    }//GEN-LAST:event_btn_OchoMouseClicked

    private void btn_NueveMouseClicked() {//GEN-FIRST:event_btn_NueveMouseClicked
        sonido("Nueve");
    }//GEN-LAST:event_btn_NueveMouseClicked
    boolean modoBotonSonido = false;
    private void btn_SinSonidoActionPerformed() {//GEN-FIRST:event_btn_SinSonidoActionPerformed

        if (!modoBotonSonido) {

            btn_SinSonido.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Sin-sonido.png"))));

            modoBotonSonido = true;

        } else {

            btn_SinSonido.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/Imagenes/Sonido.png"))));
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);

        }

        sonidoHabilitado = !sonidoHabilitado; // cambia el estado de habilitado a deshabilitado y viceversa 

    }//GEN-LAST:event_btn_SinSonidoActionPerformed

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(() -> new Calculadora().setVisible(true));
    }

    public void CambiarColorBtn(JButton btn) {

        btn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2.png"))));
        btn.setPressedIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Presionar.png"))));
        btn.setRolloverIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2.png"))));

    }

    public void CambiarColorBtn2(JButton btn) {

        btn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion.png"))));
        btn.setPressedIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Presionar.png"))));
        btn.setRolloverIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion.png"))));
        btn.setForeground(Color.decode("#000000"));

    }

    public void CambiarIconoDividir(JButton btn) {

        btn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Division.png"))));
        btn.setPressedIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Presionar-Division.png"))));
        btn.setRolloverIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Division.png"))));

    }

    public void CambiarIconoRestar(JButton btn) {

        btn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Resta.png"))));
        btn.setPressedIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Presionar-Resta.png"))));
        btn.setRolloverIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Resta.png"))));

    }

    public void CambiarIconoCancelar(JButton btn) {

        btn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-C.png"))));
        btn.setPressedIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-C-Presionar.png"))));
        btn.setRolloverIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-C.png"))));

    }

    public void CambiarIconoDelete(JButton btn) {

        btn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Delete.png"))));
        btn.setPressedIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Presionar-Delete.png"))));
        btn.setRolloverIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Operacion-Delete.png"))));

    }

    public void CambiarIconoCero(JButton btn) {

        btn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Cero.png"))));
        btn.setPressedIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Cero-Presionar.png"))));
        btn.setRolloverIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("/ImagenesUI2/Boton-I2-Cero.png"))));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_CambiodeTema;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_Cero;
    private javax.swing.JButton btn_Cinco;
    private javax.swing.JButton btn_Cuatro;
    private javax.swing.JButton btn_DIvision;
    private javax.swing.JButton btn_Dos;
    private javax.swing.JButton btn_Igual;
    private javax.swing.JButton btn_Multiplicar;
    private javax.swing.JButton btn_Nueve;
    private javax.swing.JButton btn_Ocho;
    private javax.swing.JButton btn_Punto;
    private javax.swing.JButton btn_Restar;
    private javax.swing.JButton btn_Seis;
    private javax.swing.JButton btn_Siete;
    private javax.swing.JButton btn_SinSonido;
    private javax.swing.JButton btn_Suma;
    private javax.swing.JButton btn_Tres;
    private javax.swing.JButton btn_Uno;
    private javax.swing.JPanel jpl_FondoBotones;
    private javax.swing.JPanel jpl_Pantalla;
    private javax.swing.JLabel txt_Operacion;
    private javax.swing.JLabel txt_Resultado;
    // End of variables declaration//GEN-END:variables
}
