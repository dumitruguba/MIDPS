//---------------------------------------------------------------------------

#include <vcl.h>
#include <stdio.h>
#include <stdlib.h>
#pragma hdrstop

#include "main3.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"
TForm1 *Form1;

//TRect rect, sursa, destinatie;
TRect sursa, destinatie;
int x = 10,y = 10,r=0;
//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
        : TForm(Owner)
{
        Timer2->Enabled=false;
        x = PaintBox1->Width - 50;
        y = PaintBox1->Height/2;
        PaintBox1->Canvas->MoveTo(x, y);
}
//---------------------------------------------------------------------------

int width, height;

void __fastcall TForm1::Button1Click(TObject *Sender)
{
        PaintBox1->Repaint();
        PaintBox1->Canvas->Pen->Color = clRed;
        width = Form1->PaintBox1->Width;
        height = Form1->PaintBox1->Height;
        Button2->Enabled = true;
        Button1->Enabled = false;
        Button3->Enabled = true;
        Timer2->Enabled = true;
        PaintBox1->Canvas->Pen->Color = clBlack;
        PaintBox1->Canvas->Brush->Color = clBlack;
        PaintBox1->Canvas->Brush->Style = bsCross;
        PaintBox1->Canvas->Rectangle(0, 0, PaintBox1->Width, PaintBox1->Height);

}
//---------------------------------------------------------------------------




void __fastcall TForm1::PaintBox1Click(TObject *Sender)
{
        //PaintBox1->Canvas->Pen->Color = clBlack;
        //PaintBox1->Canvas->Brush->Color = clBlack;
        //PaintBox1->Canvas->Brush->Style = bsCross;
        //PaintBox1->Canvas->Rectangle(0, 0, PaintBox1->Width, PaintBox1->Height);
}
//---------------------------------------------------------------------------

void __fastcall TForm1::Timer2Timer(TObject *Sender)
{
        randomize();
        r=rand() % Panel1->Height;
        Timer1->Tag=r;
        Panel2->Height=r;

        y =  rand() % 69 + 64;


        PaintBox1->Canvas->Pen->Color = clRed;
        PaintBox1->Canvas->LineTo(x+1, y);
        PaintBox1->Canvas->MoveTo(x, y);

        sursa = Rect(1, 0, PaintBox1->Width-1, PaintBox1->Height);
        destinatie = Rect(0, 0, PaintBox1->Width-2, PaintBox1->Height);
        PaintBox1->Canvas->CopyRect(destinatie, PaintBox1->Canvas, sursa);

        sursa = Rect(1, 0, 8, PaintBox1->Width);
        destinatie = Rect(PaintBox1->Width-8, 0, PaintBox1->Width-1, PaintBox1->Height);
        PaintBox1->Canvas->CopyRect(destinatie, PaintBox1->Canvas, sursa);
}
//---------------------------------------------------------------------------

void __fastcall TForm1::Button2Click(TObject *Sender)
{
        Timer2->Enabled = false;
        Button2->Enabled = false;
        Button1->Enabled = true;
        Button3->Enabled = true;
}
//---------------------------------------------------------------------------

void __fastcall TForm1::Button3Click(TObject *Sender)
{
        Form1->Close();
}
//---------------------------------------------------------------------------


