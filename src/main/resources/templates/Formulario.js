<form id="formulario">

  <!-- Aquí van los campos del formulario -->

  <button type="submit" id="btn-enviar">Enviar</button>

</form>

<script>
  // Obtener el formulario por su id
  const formulario = document.getElementById('formulario');

  // Agregar un controlador de envío al formulario
  formulario.addEventListener('submit', function(event) {
    // Evitar que el formulario se envíe automáticamente
    event.preventDefault();

    // Aquí puedes agregar la lógica para procesar los datos del formulario
    console.log('Formulario enviado');
  });

  // Obtener el botón "Enviar" por su id
  const btnEnviar = document.getElementById('btn-enviar');

  // Agregar un controlador de clic al botón "Enviar"
  btnEnviar.addEventListener('click', function() {
    // Aquí puedes agregar la lógica para validar los campos del formulario antes de enviarlo
    console.log('Clic en el botón "Enviar"');
  });
</script>