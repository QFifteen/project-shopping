<template>
  <navs></navs>
  <footers></footer>
</template>

<script>
// @ is an alias to /src
import navs from "../components/nav.vue"
import footers from "../components/footer.vue"

export default {
  name: 'Home',
  components: {
    navs,
    footers
  }
}
</script>
