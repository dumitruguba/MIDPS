object Form1: TForm1
  Left = 192
  Top = 146
  Width = 928
  Height = 480
  Caption = 'Form1'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -13
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 120
  TextHeight = 16
  object Label1: TLabel
    Left = 512
    Top = 32
    Width = 304
    Height = 23
    Caption = 'Incrementare Decrementare Contor'
    Font.Charset = RUSSIAN_CHARSET
    Font.Color = clRed
    Font.Height = -20
    Font.Name = 'Times New Roman'
    Font.Style = [fsBold]
    ParentFont = False
  end
  object Label2: TLabel
    Left = 488
    Top = 184
    Width = 5
    Height = 23
    Font.Charset = RUSSIAN_CHARSET
    Font.Color = clWindowText
    Font.Height = -20
    Font.Name = 'Times New Roman'
    Font.Style = [fsBold, fsItalic]
    ParentFont = False
  end
  object Button1: TButton
    Left = 56
    Top = 144
    Width = 75
    Height = 25
    Caption = 'UP'
    TabOrder = 0
    OnClick = Button1Click
  end
  object Button2: TButton
    Left = 56
    Top = 240
    Width = 75
    Height = 25
    Caption = 'DOWN'
    TabOrder = 1
    OnClick = Button2Click
  end
  object Button3: TButton
    Left = 632
    Top = 360
    Width = 75
    Height = 25
    Caption = 'EXIT'
    TabOrder = 2
    OnClick = Button3Click
  end
  object Edit1: TEdit
    Left = 176
    Top = 192
    Width = 121
    Height = 24
    TabOrder = 3
    Text = 'Edit1'
  end
end
