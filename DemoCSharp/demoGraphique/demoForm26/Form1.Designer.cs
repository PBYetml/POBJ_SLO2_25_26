namespace demoForm26
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
            btn_affichage = new Button();
            btn_test = new Button();
            bouton = new Button();
            checkBox1 = new CheckBox();
            checkedListBox1 = new CheckedListBox();
            label1 = new Label();
            textBox1 = new TextBox();
            radioButton1 = new RadioButton();
            radioButton2 = new RadioButton();
            treeView1 = new TreeView();
            SuspendLayout();
            // 
            // btn_affichage
            // 
            btn_affichage.Location = new Point(103, 40);
            btn_affichage.Name = "btn_affichage";
            btn_affichage.Size = new Size(75, 23);
            btn_affichage.TabIndex = 1;
            btn_affichage.Text = "button2";
            btn_affichage.UseVisualStyleBackColor = true;
            btn_affichage.Click += btn_affichage_Click;
            // 
            // btn_test
            // 
            btn_test.Location = new Point(275, 40);
            btn_test.Name = "btn_test";
            btn_test.Size = new Size(75, 23);
            btn_test.TabIndex = 2;
            btn_test.Text = "test";
            btn_test.UseVisualStyleBackColor = true;
            btn_test.Click += btn_test_Click;
            // 
            // bouton
            // 
            bouton.Location = new Point(208, 169);
            bouton.Name = "bouton";
            bouton.Size = new Size(75, 23);
            bouton.TabIndex = 3;
            bouton.Text = "SLO";
            bouton.UseVisualStyleBackColor = true;
            // 
            // checkBox1
            // 
            checkBox1.AutoSize = true;
            checkBox1.Location = new Point(440, 194);
            checkBox1.Name = "checkBox1";
            checkBox1.Size = new Size(83, 19);
            checkBox1.TabIndex = 4;
            checkBox1.Text = "checkBox1";
            checkBox1.UseVisualStyleBackColor = true;
            // 
            // checkedListBox1
            // 
            checkedListBox1.FormattingEnabled = true;
            checkedListBox1.Location = new Point(609, 189);
            checkedListBox1.Name = "checkedListBox1";
            checkedListBox1.Size = new Size(120, 94);
            checkedListBox1.TabIndex = 5;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(66, 300);
            label1.Name = "label1";
            label1.Size = new Size(38, 15);
            label1.TabIndex = 6;
            label1.Text = "label1";
            // 
            // textBox1
            // 
            textBox1.Location = new Point(268, 256);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(100, 23);
            textBox1.TabIndex = 7;
            // 
            // radioButton1
            // 
            radioButton1.AutoSize = true;
            radioButton1.Location = new Point(237, 341);
            radioButton1.Name = "radioButton1";
            radioButton1.Size = new Size(94, 19);
            radioButton1.TabIndex = 8;
            radioButton1.TabStop = true;
            radioButton1.Text = "radioButton1";
            radioButton1.UseVisualStyleBackColor = true;
            // 
            // radioButton2
            // 
            radioButton2.AutoSize = true;
            radioButton2.Location = new Point(237, 366);
            radioButton2.Name = "radioButton2";
            radioButton2.Size = new Size(94, 19);
            radioButton2.TabIndex = 9;
            radioButton2.TabStop = true;
            radioButton2.Text = "radioButton2";
            radioButton2.UseVisualStyleBackColor = true;
            // 
            // treeView1
            // 
            treeView1.Location = new Point(488, 361);
            treeView1.Name = "treeView1";
            treeView1.Size = new Size(8, 8);
            treeView1.TabIndex = 10;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(treeView1);
            Controls.Add(radioButton2);
            Controls.Add(radioButton1);
            Controls.Add(textBox1);
            Controls.Add(label1);
            Controls.Add(checkedListBox1);
            Controls.Add(checkBox1);
            Controls.Add(bouton);
            Controls.Add(btn_affichage);
            Controls.Add(btn_test);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        //private Button btn_couleur;
        private Button btn_affichage;
        private Button btn_test;
        private Button bouton;
        private CheckBox checkBox1;
        private CheckedListBox checkedListBox1;
        private Label label1;
        private TextBox textBox1;
        private RadioButton radioButton1;
        private RadioButton radioButton2;
        private TreeView treeView1;
    }
}
