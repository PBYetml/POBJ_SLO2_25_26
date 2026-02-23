using System.IO.Ports;
using System.Xml.Linq;

namespace demoForm26
{
    public partial class Form1 : Form
    {
        //-- attribut 
        SerialPort serialPort1; 
        public Form1()
        {
            InitializeComponent();
            serialPort1 = new SerialPort();
            serialPort1.BaudRate = 9600;
            serialPort1.PortName = "COM9"; 
        }

        private void btn_test_Click(object sender, EventArgs e)
        {
            btn_affichage.BackColor = Color.Red;
            try
            {
               serialPort1.Open();
               serialPort1.Write("hello"); 
               
                

            }
            catch (IOException ex) 
            {
                Console.WriteLine(ex.ToString());
            }
        }

        private void btn_affichage_Click(object sender, EventArgs e)
        {
            char[] tb = new char[6]; 
            btn_test.Text = "Valider";
            btn_test.BackColor = Color.Blue;
            int nbData = 0;

            string msg; 
            while (serialPort1.BytesToRead > 0)
            {
                tb[nbData] = (char)serialPort1.ReadChar();
                nbData++; 
            }

            msg = new string(tb); 



            textBox1.Text = msg;  
        }

        /*private void btn_couleur(object sender, EventArgs e)
        {
            
        }*/
    }
}
