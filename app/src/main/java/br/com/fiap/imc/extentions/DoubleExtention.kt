package br.com.fiap.imc.extentions

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)
