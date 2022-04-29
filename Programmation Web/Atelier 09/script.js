var leTableau = [5, 1, 3, 9, 10, 2, 4];

function bubbleSort(tab) {
    for (let i = 0; i < tab.length - 1; i++) {
        for (let j = i + 1; j < tab.length; j++) {
            if (tab[j] < tab[i]) {
                let varTemp = tab[i];
                tab[i] = tab[j];
                tab[j] = varTemp;
            }
        }
    }
}

bubbleSort(leTableau);
document.getElementById("h1").innerHTML = leTableau;
