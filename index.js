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
            <h3>${personaje.name}</h3>
            <span>${personaje.status}</span>

        </article>       
        `)
    const main=document.querySelector("main");
    main.append(article);
    });
});
