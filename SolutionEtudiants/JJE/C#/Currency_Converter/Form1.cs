namespace Currency_Converter
{
    public partial class Form1 : Form
    {
        double TauxChange;
        double Resultat;

        public Form1()
        {
            InitializeComponent();
        }

        private void rbnSfr_CheckedChanged(object sender, EventArgs e)
        {
            PicDevise.Image = imageList1.Images[0];
        }

        private void rbnUSD_CheckedChanged(object sender, EventArgs e)
        {
            PicDevise.Image = imageList1.Images[1];
        }

        private void rbnGBP_CheckedChanged(object sender, EventArgs e)
        {
            PicDevise.Image = imageList1.Images[2];
        }

        private void rbnYen_CheckedChanged(object sender, EventArgs e)
        {
            PicDevise.Image = imageList1.Images[3];
        }

        private void txtMontant_TextChanged(object sender, EventArgs e)
        {
            double Montant = double.Parse(txtMontant.Text);
        }

        private void txtResultat_TextChanged(object sender, EventArgs e)
        {
            txtResultat.Text = Resultat.ToString();
        }

    }
}