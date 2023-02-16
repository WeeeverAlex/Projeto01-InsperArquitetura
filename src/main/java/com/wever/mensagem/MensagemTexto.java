package com.wever.mensagem;

import com.wever.usuario.Usuario;

public class MensagemTexto {
    private String texto;
    private Usuario remetente;
    private Usuario destinatario;

    public MensagemTexto(String texto, Usuario remetente, Usuario destinatario) {
        this.texto = texto;
        this.remetente = remetente;
        this.destinatario = destinatario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Usuario getRemetente() {
        return remetente;
    }

    public void setRemetente(Usuario remetente) {
        this.remetente = remetente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

}
