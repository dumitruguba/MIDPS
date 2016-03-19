//---------------------------------------------------------------------------

#include <vcl.h>
#pragma hdrstop

#include "lab2.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"

TForm1 *Form1;

int i = 0;
int min = 0, sec = 0, zecimi = 0;

//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
        : TForm(Owner)
{
        Edit1->Text = "dd.mm.yyyy, hh:mm:ss";
        Edit2->Text = "00:00:0";
        Timer2->Enabled = false;
        Button2->Enabled = false;
        Button3->Enabled = false;

}
//---------------------------------------------------------------------------


void __fastcall TForm1::Button4Click(TObject *Sender)
{
        Form1->Close();
}
//---------------------------------------------------------------------------

void __fastcall TForm1::Button1Click(TObject *Sender)
{
        Timer2->Enabled = true ;
        Button2->Enabled = true;
        Button1->Enabled = false;
}
//---------------------------------------------------------------------------


void __fastcall TForm1::Timer1Timer(TObject *Sender)
{
        Edit1->Text = DateToStr(Date()) + ", " + TimeToStr(Time());
}
//---------------------------------------------------------------------------

void __fastcall TForm1::Button2Click(TObject *Sender)
{
        Timer2->Enabled = false ;
        Button3->Enabled = true;
        Button2->Enabled = false;
}
//---------------------------------------------------------------------------




void __fastcall TForm1::Timer2Timer(TObject *Sender)
{
        zecimi++;
        if(zecimi==10){
                sec++;
                zecimi=0;
                if(sec==60){
                        min++;
                        sec=0;
                        zecimi=0;
                }
        }
        if(sec<10 && min<10)
                Edit2->Text = "0" + IntToStr(min) + ":0" + IntToStr(sec) + ":" + IntToStr(zecimi);
        else if(sec>=10 && min<10)
                Edit2->Text = "0" + IntToStr(min) + ":" + IntToStr(sec) + ":" + IntToStr(zecimi);
        else if(sec<10 && min>=10)
                Edit2->Text = IntToStr(min) + ":0" + IntToStr(sec) + ":" + IntToStr(zecimi);
        else
                Edit2->Text = IntToStr(min) + ":" + IntToStr(sec) + ":" + IntToStr(zecimi);
}
//---------------------------------------------------------------------------

void __fastcall TForm1::Button3Click(TObject *Sender)
{
        Edit2->Text = "00:00:0";
        min=0;
        sec=0;
        zecimi=0;
        Button3->Enabled = false;
        Button1->Enabled = true;
}
//---------------------------------------------------------------------------

