/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autos;
import java.awt.event.*;
import javax.swing.*;
public class Tesla extends JFrame{
    Tesla arqui;
  
    JButton btnAgregar ,btnMostrar,btnsalir;
    JLabel  lblNombre, lblCodigo ,lblNObras,lblTrato,lblEspe,lblTipo;
    JTextField  txtNombre,txtCodigo,txtObras;
    JTable   tabla;
    JComboBox jCBContrato,jCBEspecialidad,jCBTipo_Super,jCBSalud;
    JScrollPane  barra;
    JTextArea resultado;
    
    private  void  initComponents(){  
       setSize(720,510);
       setLayout(null);
       setTitle("Repositorio Arquitectos ");//texto de ventana 
       setLocationRelativeTo(null);//la ventana en el centro 
       setDefaultCloseOperation(EXIT_ON_CLOSE);// PODER CERRAR LA VENTANA
         
      btnAgregar=new JButton("Agregar");
      btnAgregar.setBounds(50,420,120,30);
      btnAgregar.addActionListener(new ActionListener()
      {      public void actionPerformed(ActionEvent e) 
            {    
             // Registro();
            }
        });
      add(btnAgregar);
         
      btnMostrar=new JButton("Mostar Datos");
      btnMostrar.setBounds(190,420,120,30);
      btnMostrar.addActionListener(new ActionListener()
      {      public void actionPerformed(ActionEvent e) 
            {    
              // Datos();
            }
        });
      add(btnMostrar); 
      
      btnsalir=new JButton("Salir");
      btnsalir.setBounds(350,420,80,30);
      btnsalir.addActionListener(new ActionListener()
      {      public void actionPerformed(ActionEvent e) 
            {    
               System.exit(0);
            }
        });
      add(btnsalir); 
      
      lblNombre=new JLabel("Nombre :");
      lblNombre.setBounds(10,60,100,30);
      add(lblNombre);
      
      lblCodigo=new JLabel("Codigo :");
      lblCodigo.setBounds(10,20,100,30);
      add(lblCodigo);
      
      lblNObras=new JLabel("Nª.Obras :");
      lblNObras.setBounds(10,100,100,30);
      add(lblNObras);
      
      lblTrato=new JLabel("ConTrato :");
      lblTrato.setBounds(310,20,100,30);
      add(lblTrato);
      
      lblEspe=new JLabel("Especialidad :");
      lblEspe.setBounds(310,60,100,30);
      add(lblEspe);
      
      lblTipo=new JLabel("Tipo de Supervisión :");
      lblTipo.setBounds(310,100,120,30);
      add(lblTipo);
      
      txtNombre=new JTextField();
      txtNombre.setBounds(90,60,200,30);
      add(txtNombre);
      
      txtCodigo=new JTextField();
      txtCodigo.setBounds(90,20,200,30);
      add(txtCodigo);
      
      txtObras=new JTextField();
      txtObras.setBounds(90,100,200,30);
      add(txtObras);

        jCBContrato = new JComboBox();
        jCBContrato.setBounds(390,20, 200, 30);
        jCBContrato.addItem("--Selecione");
        jCBContrato.addItem("Estable");
        jCBContrato.addItem("Contratado");
        add(jCBContrato);
        
        jCBEspecialidad = new JComboBox();
        jCBEspecialidad.setBounds(390,60, 200, 30);
        jCBEspecialidad.addItem("--Selecione");
        jCBEspecialidad.addItem("Estructura");
        jCBEspecialidad.addItem("Recursos Hidricos");
        jCBEspecialidad.addItem("Ingenieria Vial");
        add(jCBEspecialidad);
        
        jCBTipo_Super = new JComboBox();
        jCBTipo_Super.setBounds(430,100, 200, 30);
        jCBTipo_Super.addItem("--Selecione");
        jCBTipo_Super.addItem("Obras");
        jCBTipo_Super.addItem("Vias");
        add(jCBTipo_Super);
        
        jCBSalud = new JComboBox();
        jCBSalud.setBounds(480,420, 130, 30);
        jCBSalud.addItem("---Tipo Salud---");
        jCBSalud.addItem("AFP");
        jCBSalud.addItem("SNP");
        add(jCBSalud);
      
      resultado=new JTextArea();
      barra=new JScrollPane();

      barra.setViewportView(resultado);
      barra.setBounds(10,150,650,250);
      add(barra);
    }
    public Tesla(){
        initComponents();
    }
    public static void main(String[] args) {
        Tesla arqui= new Tesla();
        arqui.setVisible(true);
    }
    
}
