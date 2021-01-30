W **Postman** wykonujemy zapytanie na zasobie *search*: ` https://api.spotify.com/v1/search?q=Kult&type=artist`

Należy pamiętać o umieszczeniu tokenu w wartości Bearer Token w zakładce *Authorizaion*.


Przykładowe testy do umieszczenia w zakładce *Tests*: 


```
// przypadki pozytywne (z prawidłowym tokenem)
pm.test("Status code is 200", function () {
    pm.response.to.have.status(200);
});

pm.test("Response time is less than 200ms", function () {
    pm.expect(pm.response.responseTime).to.be.below(200);
});

pm.test("Body matches string", function () {
    pm.expect(pm.response.text()).to.include("Yør Kultura");
});

pm.test("Check certain exact value of json", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.artists.items[0].name).to.be.equal("Kult");
}); 

// przypadki negatywne (po usunięciu części tokena)

pm.test("Invalid token", function () {
    var jsonData = pm.response.json();
    pm.expect(jsonData.error.status).to.be.equal(401);
    pm.expect(jsonData.error.message).to.be.equal("Invalid access token");
}); 

pm.test("Status code is 401", function () {
    pm.response.to.have.status(401);
});
```

