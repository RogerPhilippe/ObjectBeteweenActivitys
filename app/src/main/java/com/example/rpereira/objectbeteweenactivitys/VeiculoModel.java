package com.example.rpereira.objectbeteweenactivitys;

import java.io.Serializable;

public class VeiculoModel implements Serializable {

    private int midVeiculo;
    private String mTipoVeiculo;
    private String mVeiculo;

    public VeiculoModel(int idVeiculo, String tipoVeiculo, String veiculo) {
        this.midVeiculo = idVeiculo;
        this.mTipoVeiculo = tipoVeiculo;
        this.mVeiculo = veiculo;
    }

    public static class Builder {

        private int idVeiculo;
        private String tipoVeiculo;
        private String veiculo;

        public Builder setIdVeiculo(int id) {
            this.idVeiculo = id;
            return this;
        }

        public Builder setTipoVeiculo(String tipo) {
            this.tipoVeiculo = tipo;
            return this;
        }

        public Builder setVeiculo(String veiculo) {
            this.veiculo = veiculo;
            return this;
        }

        public VeiculoModel build() {
            return new VeiculoModel(idVeiculo, tipoVeiculo, veiculo);
        }

    }

    public int getMidVeiculo() {
        return midVeiculo;
    }

    public String getmTipoVeiculo() {
        return mTipoVeiculo;
    }

    public String getmVeiculo() {
        return mVeiculo;
    }

}
