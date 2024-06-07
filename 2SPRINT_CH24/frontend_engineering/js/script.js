document.getElementById("searchInput").addEventListener("input", function () {
  const query = this.value.trim().toLowerCase();
  const results = document.getElementById("results");
  results.innerHTML = "";

  if (!query) {
    return;
  }

  fetch("../database/database.json")
    .then((response) => response.json())
    .then((data) => {
      const filteredData = data.filter((oficina) =>
        oficina.nome.toLowerCase().includes(query)
      );
      filteredData.forEach((oficina) => {
        const listItem = document.createElement("li");
        listItem.textContent = `${oficina.nome} - ${oficina.endereco} (Score: ${oficina.score})`;
        results.appendChild(listItem);
      });
    })
    .catch((error) => console.error("Erro ao carregar dados:", error));
});
