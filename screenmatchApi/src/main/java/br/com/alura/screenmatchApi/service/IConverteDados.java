package br.com.alura.screenmatchApi.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
