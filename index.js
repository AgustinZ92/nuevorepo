function getCharacters(done) {
    const results = fetch("https://futuramaapi.com/api/characters");
    results
        .then(Response=> Response.json())
        .then(data=> {
            done(data)
        });
}

getCharacters(data => {
    console.log(data);

    data.items.forEach(personaje => {

        const article = document.createRange().createContextualFragment(`
        <article>
             <div class="image-contaneir">
                <img src="${personaje.image}" alt="Personaje">

            </div>
            <h2>${personaje.name}</h2>
            <span>${personaje.status}</span>

        </article>       
        `)
    const main=document.querySelector("main");
    main.append(article);
    });
});
