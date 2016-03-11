object Form1: TForm1
  Left = 192
  Top = 146
  Width = 928
  Height = 480
  Caption = 'Form1'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -10
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object PaintBox1: TPaintBox
    Left = 366
    Top = 134
    Width = 195
    Height = 195
  end
  object Label1: TLabel
    Left = 280
    Top = 88
    Width = 326
    Height = 20
    Caption = 'Resurse grafice ale mediului C++ Builder'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -16
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentFont = False
  end
  object Label2: TLabel
    Left = 400
    Top = 24
    Width = 90
    Height = 13
    Caption = 'Data si ora curenta'
  end
  object Button1: TButton
    Left = 39
    Top = 137
    Width = 61
    Height = 20
    Caption = 'Start'
    TabOrder = 0
    OnClick = Button1Click
  end
  object Button2: TButton
    Left = 39
    Top = 169
    Width = 61
    Height = 20
    Caption = 'Stop'
    TabOrder = 1
    OnClick = Button2Click
  end
  object Button3: TButton
    Left = 39
    Top = 202
    Width = 61
    Height = 20
    Caption = 'Exit'
    TabOrder = 2
    OnClick = Button3Click
  end
  object Panel1: TPanel
    Left = 312
    Top = 134
    Width = 41
    Height = 195
    Color = clBlack
    TabOrder = 3
  end
  object Panel2: TPanel
    Left = 312
    Top = 136
    Width = 41
    Height = 193
    Color = clActiveBorder
    TabOrder = 4
  end
  object Edit1: TEdit
    Left = 400
    Top = 48
    Width = 161
    Height = 21
    TabOrder = 5
    Text = 'Edit1'
  end
  object Timer1: TTimer
    OnTimer = Timer1Timer
    Left = 64
    Top = 56
  end
  object Timer2: TTimer
    Interval = 500
    OnTimer = Timer2Timer
    Left = 64
    Top = 96
  end
end
