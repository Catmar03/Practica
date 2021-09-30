
package Trapecio;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class JFrame_Trapecio extends JFrame{
    Trapecio trape;
    JButton btnAgregar ,btnMostrar,btnsalir,btnArqui;
    JLabel  lblNombre, lblIteracion,lblRespuesta,lblIntegral;
    JTextField  txtVA,txtVb,txtFuncion,txtIteracion;
    JTable   tabla;
    JScrollPane  barra;
    JTextArea resultado;
    
    private  void  initComponents(){  
       setSize(920,510);
       setLayout(null);
       setTitle("Repositorio Civil ");//texto de ventana 
       setLocationRelativeTo(null);//la ventana en el centro 
       setDefaultCloseOperation(EXIT_ON_CLOSE);// PODER CERRAR LA VENTANA
         
      btnAgregar=new JButton("Agregar");
      btnAgregar.setBounds(50,420,120,30);
      btnAgregar.addActionListener(accion);
      add(btnAgregar);
         
      btnMostrar=new JButton("Mostar Datos");
      btnMostrar.setBounds(190,420,120,30);
      btnMostrar.addActionListener(accion);
      add(btnMostrar); 
      
      btnsalir=new JButton("Salir");
      btnsalir.setBounds(350,420,80,30);
      btnsalir.addActionListener(accion);
      add(btnsalir); 
      btnArqui=new JButton("Arquitecto");
      btnArqui.setBounds(450,420,100,30);
      btnArqui.addActionListener(accion);
      add(btnArqui); 
      
      lblNombre=new JLabel("Metodo del Trapecio :");
      lblNombre.setBounds(500,10,150,30);
      add(lblNombre);
      
      lblRespuesta=new JLabel("Respuesta :");
      lblRespuesta.setBounds(400,50,100,30);
      add(lblRespuesta);
      
      lblIntegral=new JLabel("S :");
      lblIntegral.setBounds(80,50,100,60);
      lblIntegral.setFont(new Font("cooper black", Font.PLAIN, 48));
      add(lblIntegral);
      
      lblIteracion=new JLabel("N de Iteracion :");
      lblIteracion.setBounds(10,150,100,30);
      add(lblIteracion);
      
      txtVA=new JTextField();
      txtVA.setBounds(100,120,20,30);
      add(txtVA);
      
      txtFuncion=new JTextField();
      txtFuncion.setBounds(150,70,200,30);
      add(txtFuncion);
      txtIteracion=new JTextField();
      txtIteracion.setBounds(10,180,200,30);
      add(txtIteracion);
      txtVb=new JTextField();
      txtVb.setBounds(100,14,20,30);
      add(txtVb);

      resultado=new JTextArea();
      barra=new JScrollPane();

      barra.setViewportView(resultado);
      barra.setBounds(400,80,480,300);
      add(barra);
    }
    
    ActionListener accion = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == btnAgregar) {
                Registro();
            }
            if (e.getSource() == btnMostrar) {
                Datos();
            }
            if (e.getSource() == btnsalir) {
                System.exit(0);
            }
        }
    };
    
    public JFrame_Trapecio(){
        initComponents();
    }
    public void Registro(){

        float itera = Float.parseFloat(txtIteracion.getText());
        float liS = Float.parseFloat(txtVb.getText());
        float liI = Float.parseFloat(txtVA.getText());
        float funcion = Float.parseFloat(txtFuncion.getText());
        trape= new Trapecio(itera,liS,liI,funcion);
    }
    public void Datos(){
        resultado.append("Funcion f(x) = ("+trape.getVariable()+"+x^2)dx \n");
        resultado.append("Total de iteraciones             :"+trape.getN()+"\n");
        resultado.append("limite superior              :"+trape.getB()+"\n");
        resultado.append("limite inferior             :"+trape.getA()+"\n");
        resultado.append("El valor de h           :"+trape.CalcularH()+"\n");        
        resultado.append("El valor de x " +trape.Datox()+"\n");
        resultado.append("VAlor de f            :"+trape.Funcion()+"\n");
        resultado.append("Resultado            :"+trape.Resultado()+"\n");

        Limpiar();
    }
    public void Limpiar(){
        txtVA.setText("");
        txtVb.setText("");
        txtFuncion.setText("");
        txtIteracion.setText("");
    }

    public static void main(String[] args) {
        JFrame_Trapecio principal= new JFrame_Trapecio();
        principal.setVisible(true);
    }
    
}
