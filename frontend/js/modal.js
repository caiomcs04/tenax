function handleModal(name,id,description) {
  const serverEdit = document.getElementById("modal");

  return (serverEdit.innerHTML = `<div class="modal-header">
    <h5 class="modal-title" id="exampleModalLabel">Editar Servidor</h5>
    <button
      type="button"
      class="btn-close"
      data-bs-dismiss="modal"
      aria-label="Close"
    ></button>
  </div>
  <div class="modal-body">
  <section class="container d-flex justify-content-center mt-5">
  <section class="row">
    <form class="col-12 border rounded-3 border-secondary p-5 bg-white">
      <div class="mb-3">
        <label for="id" class="form-label">ID</label>
        <input type="text" class="form-control" id="id" value="${id}" disabled />
      </div>
      <div class="mb-3">
        <label for="name" class="form-label">Nome</label>
        <input type="text" class="form-control" id="name" value="${name}" />
      </div>
      <div class="mb-3">
      <label for="description" class="form-label">Descrição</label>
      <input type="text" class="form-control" id="description" value="${description}"/>
    </div>

      <script src="postServer.js"></script>
    </form>
  </section>
</section>
  </div>
  <div class="modal-footer d-flex justify-content-center">
    <button
      type="button"
      class="btn btn-danger"
      data-bs-dismiss="modal"
    >
      Cancelar
    </button>
    <button type="button" class="btn btn-primary" onclick="putServer(${id})" data-bs-dismiss="modal">Salvar mudanças</button>
  </div>
  `);
}
