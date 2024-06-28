package br.com.trybe.multiplasactivities

// O Intent não possui definição de contexto e componente que precisa ser iniciado.
// O Intent será criado, e qualquer componente no dispositivo que tenha declarado um intent-filter
// correspondente conseguirá resolver o Intent.

//val sendIntent = Intent().apply {
//    action = Intent.ACTION_SEND
//     putExtra(Intent.EXTRA_TEXT, textMessage)
//     type = "text/plain"
//}
//
//if (sendIntent.resolveActivity(packageManager) != null) {
//    startActivity(sendIntent)
//}