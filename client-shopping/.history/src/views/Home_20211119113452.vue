<template>
  <navs></navs>
  <footera></footera>
</template>

<script>
// @ is an alias to /src
import navs from "../components/nav.vue"
import footera from "../components/footer.vue"

export default {
  name: 'Home',
  components: {
    navs,
    footera
  }
}
</script>
