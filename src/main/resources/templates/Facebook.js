<script>
  // Obtener los botones de acceso por su clase
  const btnFacebook = document.querySelector('.fb');
  const btnTwitter = document.querySelector('.tw');
  const btnCorreo = document.querySelector('.correo');

  // Agregar un controlador de clic a cada botón
  btnFacebook.addEventListener('click', function() {
    // Aquí puedes agregar la lógica para acceder con Facebook
    console.log('Clic en el botón "Acceder con Facebook"');
  });

  btnTwitter.addEventListener('click', function() {
    // Aquí puedes agregar la lógica para acceder con Twitter
    console.log('Clic en el botón "Acceder con Twitter"');
  });

  btnCorreo.addEventListener('click', function() {
    // Aquí puedes agregar la lógica para acceder con Correo
    console.log('Clic en el botón "Acceder con Correo"');
  });
</script>