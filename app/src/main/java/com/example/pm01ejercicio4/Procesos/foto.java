package com.example.pm01ejercicio4.Procesos;

public class foto
{

    private String txtnombre;
    private String txtdes;
    private blob Fotografia;

    public String getTxtnombre() {
        return txtnombre;
    }

    public String getTxtdes() {
        return txtdes;
    }

    public void setTxtnombre(String txtnombre) {
        this.txtnombre = txtnombre;
    }

    public void setTxtdes(String txtdes) {
        this.txtdes = txtdes;
    }

    public void setFotografia(blob fotografia) {
        Fotografia = fotografia;
    }

    public blob getFotografia() {
        return Fotografia;
    }

    public foto(String txtnombre, String txtdes, blob fotografia) {
        this.txtnombre = txtnombre;
        this.txtdes = txtdes;
        Fotografia = fotografia;
    }
}
