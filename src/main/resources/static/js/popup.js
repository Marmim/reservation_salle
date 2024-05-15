document.addEventListener('DOMContentLoaded', function() {
    var proposerLink = document.getElementById('proposer_link');
    proposerLink.addEventListener('click', function() {
        var modal = document.getElementById('inscriptionModal');
        if (modal) {
            modal.style.display = 'block';
        }
    });


    window.addEventListener('click', function(event) {
        var modal = document.getElementById('inscriptionModal');
        if (event.target === modal) {
            modal.style.display = 'none';
        }
    });
});
