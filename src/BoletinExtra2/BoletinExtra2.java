package BoletinExtra2;

import java.util.Scanner;

public class BoletinExtra2 {

    public static void main(String[] args) {

        Conta conta1 = new Conta("Hugo", "DE", 874, 65);
        conta1.mostrarDatos(conta1);

        System.out.println("------------------------");

        Conta conta2 = new Conta("MAMA", "YEGUA", 642, 289);
        conta2.mostrarDatos(conta2);

        System.out.println("------------------------");

        conta1.transferencia(conta1, conta2);
        System.out.println("------------------------");
        System.out.println("Saldo cuenta 1: " + conta1.getSaldo());
        System.out.println("Saldo conta 2: " + conta2.getSaldo());
    }

    public static class Conta {

        private String nome_do_cliente;
        private String numero_da_conta;
        private double tipo_de_interese;
        private double saldo;

        public Conta() {

        }

        public Conta(String nome_do_cliente, String numero_da_conta, double tipo_de_interese, double saldo) {

            this.nome_do_cliente = nome_do_cliente;
            this.numero_da_conta = numero_da_conta;
            this.tipo_de_interese = tipo_de_interese;
            this.saldo = saldo;

        }

        public void setNomeCliente(String nome_do_cliente) {

            this.nome_do_cliente = nome_do_cliente;

        }

        public void setNumeroConta(String numero_da_conta) {

            this.numero_da_conta = numero_da_conta;

        }

        public void setTiposInterese(double tipos_de_interese) {

            this.tipo_de_interese = tipos_de_interese;

        }

        public void setSaldo(double saldo) {

            this.saldo = saldo;

        }

        public String getNomeCliente() {

            return nome_do_cliente;

        }

        public String getNumeroConta() {

            return numero_da_conta;

        }

        public double getTiposIntereses() {

            return tipo_de_interese;

        }

        public double getSaldo() {

            return saldo;

        }

        public void ingresar(double ingreso) {

            saldo = saldo + ingreso;

        }

        public void reintegro(double reintegro) {

            saldo = saldo - reintegro;

        }

        public void transferencia(Conta contaOrigen, Conta cuentaDestino) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingreso en la cuenta de: ");
            double ingreso = sc.nextDouble();
            contaOrigen.reintegro(ingreso);
            cuentaDestino.ingresar(ingreso);

        }

        public void mostrarDatos(Conta contaMostrar) {

            System.out.println("Nome do cliente: " + nome_do_cliente + "\nNumero da conta: " + numero_da_conta);
            System.out.println("Tipo de interese: " + tipo_de_interese + "\nSaldo: " + saldo);

        }

    }
}