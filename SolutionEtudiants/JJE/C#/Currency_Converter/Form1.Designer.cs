namespace Currency_Converter
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.PicDevise = new System.Windows.Forms.PictureBox();
            this.rbnSFR = new System.Windows.Forms.RadioButton();
            this.rbnUSD = new System.Windows.Forms.RadioButton();
            this.rbnGBP = new System.Windows.Forms.RadioButton();
            this.rbnYEN = new System.Windows.Forms.RadioButton();
            this.btnConvertir = new System.Windows.Forms.Button();
            this.txtMontant = new System.Windows.Forms.TextBox();
            this.txtResultat = new System.Windows.Forms.TextBox();
            this.labelResultEuro = new System.Windows.Forms.Label();
            this.labelMontant = new System.Windows.Forms.Label();
            this.imageList1 = new System.Windows.Forms.ImageList(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.PicDevise)).BeginInit();
            this.SuspendLayout();
            // 
            // PicDevise
            // 
            this.PicDevise.Image = global::Ex1_Currency_Converter.Properties.Resources.USA_F_Yeah;
            this.PicDevise.Location = new System.Drawing.Point(426, 12);
            this.PicDevise.Name = "PicDevise";
            this.PicDevise.Size = new System.Drawing.Size(254, 202);
            this.PicDevise.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.PicDevise.TabIndex = 0;
            this.PicDevise.TabStop = false;
            //this.PicDevise.Click += new System.EventHandler(this.PicDevise_Click);
            // 
            // rbnSFR
            // 
            this.rbnSFR.AutoSize = true;
            this.rbnSFR.Location = new System.Drawing.Point(63, 58);
            this.rbnSFR.Name = "rbnSFR";
            this.rbnSFR.Size = new System.Drawing.Size(89, 19);
            this.rbnSFR.TabIndex = 1;
            this.rbnSFR.TabStop = true;
            this.rbnSFR.Text = "Franc Suisse";
            this.rbnSFR.UseVisualStyleBackColor = true;
            // 
            // rbnUSD
            // 
            this.rbnUSD.AutoSize = true;
            this.rbnUSD.Location = new System.Drawing.Point(63, 83);
            this.rbnUSD.Name = "rbnUSD";
            this.rbnUSD.Size = new System.Drawing.Size(77, 19);
            this.rbnUSD.TabIndex = 2;
            this.rbnUSD.TabStop = true;
            this.rbnUSD.Text = "US dollars";
            this.rbnUSD.UseVisualStyleBackColor = true;
            // 
            // rbnGBP
            // 
            this.rbnGBP.AutoSize = true;
            this.rbnGBP.Location = new System.Drawing.Point(63, 108);
            this.rbnGBP.Name = "rbnGBP";
            this.rbnGBP.Size = new System.Drawing.Size(98, 19);
            this.rbnGBP.TabIndex = 3;
            this.rbnGBP.TabStop = true;
            this.rbnGBP.Text = "Livres Sterling";
            this.rbnGBP.UseVisualStyleBackColor = true;
            // 
            // rbnYEN
            // 
            this.rbnYEN.AutoSize = true;
            this.rbnYEN.Location = new System.Drawing.Point(63, 133);
            this.rbnYEN.Name = "rbnYEN";
            this.rbnYEN.Size = new System.Drawing.Size(92, 19);
            this.rbnYEN.TabIndex = 4;
            this.rbnYEN.TabStop = true;
            this.rbnYEN.Text = "Yen Japonais";
            this.rbnYEN.UseVisualStyleBackColor = true;
            // 
            // btnConvertir
            // 
            this.btnConvertir.Location = new System.Drawing.Point(346, 324);
            this.btnConvertir.Name = "btnConvertir";
            this.btnConvertir.Size = new System.Drawing.Size(75, 23);
            this.btnConvertir.TabIndex = 5;
            this.btnConvertir.Text = "Convertir";
            this.btnConvertir.UseVisualStyleBackColor = true;
            // 
            // txtMontant
            // 
            this.txtMontant.Location = new System.Drawing.Point(97, 345);
            this.txtMontant.Name = "txtMontant";
            this.txtMontant.Size = new System.Drawing.Size(100, 23);
            this.txtMontant.TabIndex = 6;
            this.txtMontant.TextChanged += new System.EventHandler(this.txtMontant_TextChanged);
            // 
            // txtResultat
            // 
            this.txtResultat.Location = new System.Drawing.Point(580, 342);
            this.txtResultat.Name = "txtResultat";
            this.txtResultat.Size = new System.Drawing.Size(100, 23);
            this.txtResultat.TabIndex = 7;
            this.txtResultat.TextChanged += new System.EventHandler(this.txtResultat_TextChanged);
            // 
            // labelResultEuro
            // 
            this.labelResultEuro.AutoSize = true;
            this.labelResultEuro.Location = new System.Drawing.Point(580, 324);
            this.labelResultEuro.Name = "labelResultEuro";
            this.labelResultEuro.Size = new System.Drawing.Size(92, 15);
            this.labelResultEuro.TabIndex = 8;
            this.labelResultEuro.Text = "Resultat en Euro";
            // 
            // labelMontant
            // 
            this.labelMontant.AutoSize = true;
            this.labelMontant.Location = new System.Drawing.Point(97, 324);
            this.labelMontant.Name = "labelMontant";
            this.labelMontant.Size = new System.Drawing.Size(53, 15);
            this.labelMontant.TabIndex = 9;
            this.labelMontant.Text = "Montant";
            // 
            // imageList1
            // 
            this.imageList1.ColorDepth = System.Windows.Forms.ColorDepth.Depth32Bit;
            this.imageList1.ImageStream = ((System.Windows.Forms.ImageListStreamer)(resources.GetObject("imageList1.ImageStream")));
            this.imageList1.TransparentColor = System.Drawing.Color.Transparent;
            this.imageList1.Images.SetKeyName(0, "Souisse.png");
            this.imageList1.Images.SetKeyName(1, "USA_F_Yeah.png");
            this.imageList1.Images.SetKeyName(2, "Bri_ish.png");
            this.imageList1.Images.SetKeyName(3, "Toyota_Banzai.png");
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 15F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.labelMontant);
            this.Controls.Add(this.labelResultEuro);
            this.Controls.Add(this.txtResultat);
            this.Controls.Add(this.txtMontant);
            this.Controls.Add(this.btnConvertir);
            this.Controls.Add(this.rbnYEN);
            this.Controls.Add(this.rbnGBP);
            this.Controls.Add(this.rbnUSD);
            this.Controls.Add(this.rbnSFR);
            this.Controls.Add(this.PicDevise);
            this.Name = "Form1";
            this.Text = "Form1";
            ((System.ComponentModel.ISupportInitialize)(this.PicDevise)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private PictureBox PicDevise;
        private RadioButton rbnSFR;
        private RadioButton rbnUSD;
        private RadioButton rbnGBP;
        private RadioButton rbnYEN;
        private Button btnConvertir;
        private TextBox txtMontant;
        private TextBox txtResultat;
        private Label labelResultEuro;
        private Label labelMontant;
        private ImageList imageList1;
    }
}