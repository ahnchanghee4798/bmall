<template>

    <v-data-table
        :headers="headers"
        :items="orderSt"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderStView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            orderSt : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderSts'))

            temp.data._embedded.orderSts.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderSt = temp.data._embedded.orderSts;
        },
        methods: {
        }
    }
</script>

