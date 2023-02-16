package com.wever;


import com.wever.mensagem.Mensagem;
import com.wever.mensagem.MensagemArquivo;
import com.wever.mensagem.MensagemTexto;
import com.wever.usuario.Usuario;




public class Main 
{
    public static void main( String[] args )
    {
        Usuario remetente = new Usuario("Wever");
        Usuario destinatario = new Usuario("João");

        Mensagem mensagem = new Mensagem("Olá, tudo bem?", remetente, destinatario);
        MensagemTexto mensagemTexto = new MensagemTexto("Tudo bem e você?", remetente, destinatario);
        MensagemArquivo mensagemArquivo = new MensagemArquivo("arquivo.txt", "arquivo.txt", remetente, destinatario);

        System.out.println(mensagem.getTexto());
        System.out.println(mensagemTexto.getTexto());
        System.out.println(mensagemArquivo.getTexto());
    }
}
