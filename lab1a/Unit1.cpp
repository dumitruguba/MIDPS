//---------------------------------------------------------------------------

#include <vcl.h>
#pragma hdrstop

#include "Unit1.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"
TForm1 *Form1;
int nr = 0;
//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
        : TForm(Owner)
{
        Form1->Caption = "MIDPS 1- A";
        Edit1->Text = 0;
        Label2->Caption = "initial i este 0";
}
//---------------------------------------------------------------------------


void __fastcall TForm1::Button1Click(TObject *Sender)
{
        Label2->Caption = "i creste in Edit1";
        nr++;
        Edit1->Text = nr;

}
//---------------------------------------------------------------------------

void __fastcall TForm1::Button2Click(TObject *Sender)
{
        Label2->Caption = "i scade in Edit1";
        nr--;
        Edit1->Text = nr;
}
//---------------------------------------------------------------------------


void __fastcall TForm1::Button3Click(TObject *Sender)
{
        Form1->Close();
}
//---------------------------------------------------------------------------
