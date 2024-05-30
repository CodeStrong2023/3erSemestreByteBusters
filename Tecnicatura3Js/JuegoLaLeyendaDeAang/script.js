function iniciarJuego(){
    let botonPersonajeJugador = document.getElementById('boton-personaje');
    botonPersonajeJugador.addEventListener('click',seleccionarPersonajeJugador);
}
const nombres = ['Katara', 'Aang', 'Toph', 'Zuko'];

function seleccionarPersonajeEnemigo() {
  const indiceAleatorio = Math.floor(Math.random() * nombres.length);
  return nombres[indiceAleatorio];
}

function seleccionarPersonajeJugador(){
    let inputZuko = document.getElementById('zuko');
    let inputKatara = document.getElementById('katara');
    let inputAang = document.getElementById('aang');
    let inputToph = document.getElementById('toph');
    let SpanPersonajeJugador = document.getElementById('personaje-jugador');
    let SpanPersonajeEnemigo = document.getElementById('personaje-enemigo');
    const PersonajeEnemigo = seleccionarPersonajeEnemigo();

    
    if(inputZuko.checked){
        alert('Seleccionaste a Zuko');
        SpanPersonajeJugador.innerHTML = 'Zuko';
        SpanPersonajeEnemigo.innerHTML = PersonajeEnemigo;
    }else if(inputKatara.checked){
        alert('Seleccionaste a Katara');
        SpanPersonajeJugador.innerHTML = 'Katara';
        SpanPersonajeEnemigo.innerHTML = PersonajeEnemigo;
    }else if(inputAang.checked){
        alert('Seleccionaste a Aang');
        SpanPersonajeJugador.innerHTML = 'Aang';
        SpanPersonajeEnemigo.innerHTML = PersonajeEnemigo;
    }else if(inputToph.checked){
        alert('Seleccionaste a Toph');
        SpanPersonajeJugador.innerHTML = 'Toph';
        SpanPersonajeEnemigo.innerHTML = PersonajeEnemigo;
    }else{
        alert('Elige un personaje')
    } 
}

window.addEventListener('load', iniciarJuego)